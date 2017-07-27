package com.design.patterns.mvc.model;

import java.util.ArrayList;

import javax.sound.midi.MetaEventListener;
import javax.sound.midi.MetaMessage;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;

import com.design.patterns.mvc.view.BPMObserver;
import com.design.patterns.mvc.view.BeatObserver;

public class BeatModel implements BeatModelInterface, MetaEventListener {
	Sequencer sequencer;
	ArrayList<BeatObserver> beatObservers = new ArrayList<BeatObserver>();
	ArrayList<BPMObserver> bpmObservers = new ArrayList<BPMObserver>();
	int bpm = 90;
	Sequence sequence;
	Track track;

	@Override
	public void meta(MetaMessage message) {
		// TODO Auto-generated method stub
		if(message.getType() == 47) {
			beatEvent();
			sequencer.start();
			setBPM(getBPM());
		}
	}

	@Override
	public void initialize() {
		// TODO Auto-generated method stub
		setupMidi();
		buildTrackAndStart();
	}

	@Override
	public void on() {
		// TODO Auto-generated method stub
		System.out.println("Starting the sequencer");
		sequencer.start();
		setBPM(90);
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		setBPM(0);
		sequencer.stop();
	}

	@Override
	public void setBPM(int bpm) {
		// TODO Auto-generated method stub
		this.bpm = bpm;
		sequencer.setTempoInBPM(getBPM());
		notifyBPMObservers();
	}

	@Override
	public int getBPM() {
		// TODO Auto-generated method stub
		return bpm;
	}

	public void beatEvent() {
		notifyBeatObservers();
	}

	@Override
	public void registerObserver(BeatObserver beatObserver) {
		// TODO Auto-generated method stub
		beatObservers.add(beatObserver);
	}

	@Override
	public void removeObserver(BeatObserver beatObserver) {
		// TODO Auto-generated method stub
		int i = beatObservers.indexOf(beatObserver);
		if (i >= 0) {
			beatObservers.remove(i);
		}
	}

	@Override
	public void removeObserver(BPMObserver bpmObserver) {
		// TODO Auto-generated method stub
		int i = bpmObservers.indexOf(bpmObserver);
		if (i >= 0) {
			bpmObservers.remove(i);
		}
	}

	@Override
	public void registerObserver(BPMObserver bpmObserver) {
		// TODO Auto-generated method stub
		bpmObservers.add(bpmObserver);
	}

	private void buildTrackAndStart() {
		// TODO Auto-generated method stub
		int[] trackList = { 35, 0, 46, 0 };
		sequence.deleteTrack(null);
		track = sequence.createTrack();
		makeTracks(trackList);
		track.add(makeEvent(192, 9, 1, 0, 4));
		try {
			sequencer.setSequence(sequence);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private MidiEvent makeEvent(int comd, int chan, int one, int two, int tick) {
		// TODO Auto-generated method stub
		MidiEvent event = null;
		try {
			ShortMessage shortMessage = new ShortMessage();
			shortMessage.setMessage(comd, chan, one, two);
			event = new MidiEvent(shortMessage, tick);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return event;
	}

	private void makeTracks(int[] trackList) {
		// TODO Auto-generated method stub
		for (int i = 0; i < trackList.length; i++) {
			int key = trackList[i];
			if (key != 0) {
				track.add(makeEvent(144, 9, key, 100, i));
				track.add(makeEvent(128, 9, key, 100, i + 1));
			}
		}
	}

	private void setupMidi() {
		// TODO Auto-generated method stub
		try {
			sequencer = MidiSystem.getSequencer();
			sequencer.open();
			sequencer.addMetaEventListener(this);
			sequence = new Sequence(Sequence.PPQ, 4);
			track = sequence.createTrack();
			sequencer.setTempoInBPM(getBPM());
			sequencer.setLoopCount(Sequencer.LOOP_CONTINUOUSLY);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void notifyBPMObservers() {
		// TODO Auto-generated method stub
		for (int i = 0; i < bpmObservers.size(); i++) {
			BPMObserver bpmObserver = bpmObservers.get(i);
			bpmObserver.updateBPM();
		}
	}

	private void notifyBeatObservers() {
		// TODO Auto-generated method stub
		for(int i=0; i<beatObservers.size();i++) {
			BeatObserver beatObserver = beatObservers.get(i);
			beatObserver.updateBeat();
		}
	}
}

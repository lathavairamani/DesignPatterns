package com.design.patterns.mvc.heart.model;

import java.util.ArrayList;
import java.util.Random;

import com.design.patterns.mvc.view.BPMObserver;
import com.design.patterns.mvc.view.BeatObserver;

public class HeartModel implements HeartModelInterface, Runnable {
	ArrayList<BeatObserver> beatObservers = new ArrayList<BeatObserver>();
	ArrayList<BPMObserver> bpmObservers = new ArrayList<BPMObserver>();
	int time = 1000;
	int bpm = 90;
	Random random = new Random(System.currentTimeMillis());
	Thread thread;

	public HeartModel() {
		// TODO Auto-generated constructor stub
		thread = new Thread(this);
		thread.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int lastrate = -1;

		for (;;) {
			int change = random.nextInt(10);
			if (random.nextInt(2) == 0) {
				change = 0 - change;
			}
			int rate = 60000 / (time + change);
			if (rate < 120 && rate > 50) {
				time += change;
				notifyBeatObservers();
				if (rate != lastrate) {
					lastrate = rate;
					notifyBPMObservers();
				}
			}
			try {
				Thread.sleep(time);
			} catch (Exception e) {
				e.printStackTrace();
			}
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
		for (int i = 0; i < beatObservers.size(); i++) {
			BeatObserver beatObserver = beatObservers.get(i);
			beatObserver.updateBeat();
		}
	}

	@Override
	public int getHeartRate() {
		// TODO Auto-generated method stub
		return 60000 / time;
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
	public void registerObserver(BPMObserver bpmObserver) {
		// TODO Auto-generated method stub
		bpmObservers.add(bpmObserver);
	}

	@Override
	public void removeObserver(BPMObserver bpmObserver) {
		// TODO Auto-generated method stub
		int i = bpmObservers.indexOf(bpmObserver);
		if (i >= 0) {
			bpmObservers.remove(i);
		}
	}

}

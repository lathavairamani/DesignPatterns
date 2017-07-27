package com.design.patterns.mvc.heart.adapter;

import com.design.patterns.mvc.heart.model.HeartModelInterface;
import com.design.patterns.mvc.model.BeatModelInterface;
import com.design.patterns.mvc.view.BPMObserver;
import com.design.patterns.mvc.view.BeatObserver;

public class HeartAdapter implements BeatModelInterface {
	HeartModelInterface heart;
	
	public HeartAdapter(HeartModelInterface heart) {
		this.heart = heart;
	}

	@Override
	public void initialize() {
		// TODO Auto-generated method stub

	}

	@Override
	public void on() {
		// TODO Auto-generated method stub

	}

	@Override
	public void off() {
		// TODO Auto-generated method stub

	}

	@Override
	public void setBPM(int bpm) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getBPM() {
		// TODO Auto-generated method stub
		return heart.getHeartRate();
	}

	@Override
	public void registerObserver(BeatObserver beatObserver) {
		// TODO Auto-generated method stub
		heart.registerObserver(beatObserver);
	}

	@Override
	public void removeObserver(BeatObserver beatObserver) {
		// TODO Auto-generated method stub
		heart.removeObserver(beatObserver);
	}

	@Override
	public void removeObserver(BPMObserver bpmObserver) {
		// TODO Auto-generated method stub
		heart.removeObserver(bpmObserver);
	}

	@Override
	public void registerObserver(BPMObserver bpmObserver) {
		// TODO Auto-generated method stub
		heart.registerObserver(bpmObserver);
	}

}

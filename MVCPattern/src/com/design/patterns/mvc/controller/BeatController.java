package com.design.patterns.mvc.controller;

import com.design.patterns.mvc.model.BeatModelInterface;
import com.design.patterns.mvc.view.DJView;

public class BeatController implements ControllerInterface {
	BeatModelInterface model;
	DJView view;
	
	public BeatController(BeatModelInterface model) {
		this.model = model;
		view = new DJView(this, model);
		view.createView();
		view.createControls();
		view.disableStopMenuItem();
		view.disableStartMenuItem();
		model.initialize();
	}

	@Override
	public void setBPM(int bpm) {
		// TODO Auto-generated method stub
		model.setBPM(bpm);
	}

	@Override
	public void increaseBPM() {
		// TODO Auto-generated method stub
		int bpm = model.getBPM();
		model.setBPM(bpm + 1);
	}

	@Override
	public void decreaseBPM() {
		// TODO Auto-generated method stub
		int bpm = model.getBPM();
		model.setBPM(bpm - 1);
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		model.on();
		view.disableStartMenuItem();
		view.enableStopMenuItem();
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		model.off();
		view.disableStopMenuItem();
		view.enableStartMenuItem();
	}

}

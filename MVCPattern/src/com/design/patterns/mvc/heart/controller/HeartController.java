package com.design.patterns.mvc.heart.controller;

import com.design.patterns.mvc.controller.ControllerInterface;
import com.design.patterns.mvc.heart.adapter.HeartAdapter;
import com.design.patterns.mvc.heart.model.HeartModelInterface;
import com.design.patterns.mvc.view.DJView;

public class HeartController implements ControllerInterface {
	HeartModelInterface model;
	DJView view;
	
	public HeartController(HeartModelInterface model) {
		this.model = model;
		view = new DJView(this, new HeartAdapter(model));
		view.createView();
		view.createControls();
		view.disableStopMenuItem();
		view.disableStartMenuItem();
	}

	@Override
	public void setBPM(int bpm) {
		// TODO Auto-generated method stub

	}

	@Override
	public void increaseBPM() {
		// TODO Auto-generated method stub

	}

	@Override
	public void decreaseBPM() {
		// TODO Auto-generated method stub

	}

	@Override
	public void start() {
		// TODO Auto-generated method stub

	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub

	}

}

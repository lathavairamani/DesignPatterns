package com.design.patterns.mvc;

import com.design.patterns.mvc.model.BeatModelInterface;
import com.design.patterns.mvc.controller.BeatController;
import com.design.patterns.mvc.controller.ControllerInterface;
import com.design.patterns.mvc.model.BeatModel;

public class DJTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeatModelInterface model = new BeatModel();
		ControllerInterface controller = new BeatController(model);
	}

}

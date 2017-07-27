package com.design.patterns.mvc.heart;

import com.design.patterns.mvc.controller.ControllerInterface;
import com.design.patterns.mvc.heart.controller.HeartController;
import com.design.patterns.mvc.heart.model.HeartModel;
import com.design.patterns.mvc.heart.model.HeartModelInterface;

public class HeartTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HeartModelInterface model = new HeartModel();
		ControllerInterface controller = new HeartController(model);
	}

}

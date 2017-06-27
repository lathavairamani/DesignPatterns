package com.design.patterns.beverages;

import com.design.patterns.Beverage;

public class HouseBlend extends Beverage {

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 1.99;
	}
	
	public HouseBlend() {
		description = "HouseBlend";
	}

}

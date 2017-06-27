package com.design.patterns.beverages;

import com.design.patterns.Beverage;

public class DeCaf extends Beverage {
	
	public DeCaf() {
		description = "DeCaf";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 1.29;
	}

}

package com.design.patterns.condiments;

import com.design.patterns.Beverage;
import com.design.patterns.CondimentDecorator;

public class Mocha extends CondimentDecorator {
	
	Beverage beverage;
	
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription() + ", Mocha";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return beverage.cost() + 1.0;
	}

}

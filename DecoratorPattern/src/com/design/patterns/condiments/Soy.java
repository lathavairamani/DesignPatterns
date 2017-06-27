package com.design.patterns.condiments;

import com.design.patterns.Beverage;
import com.design.patterns.CondimentDecorator;

public class Soy extends CondimentDecorator {
	
	Beverage beverage;
	
	public Soy(Beverage beverage) { 
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription() + ", Soy";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return beverage.cost() + 2.0;
	}

}

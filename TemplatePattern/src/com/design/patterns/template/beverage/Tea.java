package com.design.patterns.template.beverage;

public class Tea extends CaffieneBeverage {

	@Override
	public void brew() {
		// TODO Auto-generated method stub
		System.out.println("Dipping tea bag");
	}

	@Override
	public void addCondiments() {
		// TODO Auto-generated method stub
		System.out.println("Adding lemon");
	}

}

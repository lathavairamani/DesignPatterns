package com.design.patterns.template.beverage;

public class Coffee extends CaffieneBeverage {

	@Override
	public void brew() {
		// TODO Auto-generated method stub
		System.out.println("Brewing coffee");
	}

	@Override
	public void addCondiments() {
		// TODO Auto-generated method stub
		System.out.println("Adding sugar and milk");
	}

}

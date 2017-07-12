package com.design.patterns.template.beverage;

public abstract class CaffieneBeverage {
	
	// Template method consists of steps of algorithm. 
	// It's declared final to prevent subclasses from reworking the sequence of steps in the algorithm.
	public final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}
	
	public void boilWater() {
		System.out.println("Boiling Water");
	}
	
	public abstract void brew();
	public abstract void addCondiments();
	
	public void pourInCup() {
		System.out.println("Pouring in cup");
	}
	
}

package com.design.patterns.template.hook;

public abstract class CaffieneBeverageWithHook {
	
	// Template method consists of steps of algorithm. 
	// It's declared final to prevent subclasses from reworking the sequence of steps in the algorithm.
	public final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		if(customerWantsCondiments()) {
			addCondiments();
		}
	}
	
	// This is a hook because the subclass can override this method, but doesn't have to
	public boolean customerWantsCondiments() {
		// TODO Auto-generated method stub
		return true;
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

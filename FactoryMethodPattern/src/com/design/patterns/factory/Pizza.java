package com.design.patterns.factory;

import java.util.ArrayList;

public abstract class Pizza {
	public String name;
	public String dough;
	public String sauce;
	public ArrayList<String> toppings = new ArrayList<String>();
	
	public void prepare() {
		System.out.println("Preparing " + name);
		System.out.println("With Dough: " + dough);
		System.out.println("With Sauce: " + sauce);
		System.out.println("Adding toppings: ");
		for(String topping : toppings) {
			System.out.println(" " + topping);
		}
	}
	
	public void bake() {
		System.out.println("Baking for 20 mins at 400");
	}
	
	public void cut() {
		System.out.println("Cutting into diagonal slices");
	}
	
	public void box() {
		System.out.println("Boxing...");
	}
	
}

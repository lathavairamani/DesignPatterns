package com.design.patterns.factory.pizza;

import com.design.patterns.factory.Pizza;

public class NYStyleVeggiePizza extends Pizza {
	
	public NYStyleVeggiePizza() {
		name = "NYStyleVeggiePizza";
		dough = "Thin Crust";
		sauce = "Buffalo Sauce";
		toppings.add("Mozorella cheese");
	}
	
	public void bake() {
		  System.out.println("Baking for 15 mins at 400");
	}
}

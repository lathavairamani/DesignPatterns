package com.design.patterns.factory.pizza;

import com.design.patterns.factory.Pizza;

public class NYStyleClamPizza extends Pizza {
	
	public NYStyleClamPizza() {
		name = "NYStyleClamPizza";
		dough = "Thin Crust";
		sauce = "Buffalo Sauce";
		toppings.add("Mozorella cheese");
	}
	
	public void bake() {
		  System.out.println("Baking for 15 mins at 400");
	}
}

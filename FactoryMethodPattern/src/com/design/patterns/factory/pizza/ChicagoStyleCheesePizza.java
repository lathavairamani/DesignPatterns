package com.design.patterns.factory.pizza;

import com.design.patterns.factory.Pizza;

public class ChicagoStyleCheesePizza extends Pizza {
	
	public ChicagoStyleCheesePizza() {
		name = "ChicagoStyleCheesePizza";
		dough = "Thick Crust";
		sauce = "Basil Pesto Sauce";
		toppings.add("Blue cheese");
	}
	
	public void cut() {
		  System.out.println("Cutting into square slices");
	}
}

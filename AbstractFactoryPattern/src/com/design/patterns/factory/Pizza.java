package com.design.patterns.factory;

import com.design.patterns.factory.pizzaingredient.Cheese;
import com.design.patterns.factory.pizzaingredient.Clam;
import com.design.patterns.factory.pizzaingredient.Dough;
import com.design.patterns.factory.pizzaingredient.Sauce;
import com.design.patterns.factory.pizzaingredient.Veggies;

public abstract class Pizza {
	public String name;
	public Dough dough;
	public Sauce sauce;
	public Cheese cheese;
	public Clam clam;
	public Veggies veggies[];
	
	public abstract void prepare(); 
	
	public void bake() {
		System.out.println("Baking for 20 mins at 400");
	}
	
	public void cut() {
		System.out.println("Cutting into diagonal slices");
	}
	
	public void box() {
		System.out.println("Boxing...");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

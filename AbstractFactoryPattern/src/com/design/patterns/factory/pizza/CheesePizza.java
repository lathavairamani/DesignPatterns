package com.design.patterns.factory.pizza;

import com.design.patterns.factory.Pizza;
import com.design.patterns.factory.PizzaIngredientFactory;

public class CheesePizza extends Pizza {
	
	PizzaIngredientFactory pizzaIngredientFactory;
	
	public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
		this.pizzaIngredientFactory = pizzaIngredientFactory;
	}
	
	public void cut() {
		  System.out.println("Cutting into square slices");
	}

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		System.out.println("Preparing " + name);
		dough = pizzaIngredientFactory.createDough();
		sauce = pizzaIngredientFactory.createSauce();
		cheese = pizzaIngredientFactory.createCheese();
	}
}

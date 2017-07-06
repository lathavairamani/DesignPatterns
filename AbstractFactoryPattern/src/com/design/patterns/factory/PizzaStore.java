package com.design.patterns.factory;

public abstract class PizzaStore {
	Pizza pizza;
	
	protected abstract Pizza createPizza(String type);
	
	public Pizza orderPizza(String type) {
		
		pizza = createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
		
	}
	

}

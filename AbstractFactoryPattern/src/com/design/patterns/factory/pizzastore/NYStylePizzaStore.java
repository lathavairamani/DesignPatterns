package com.design.patterns.factory.pizzastore;

import com.design.patterns.factory.Pizza;
import com.design.patterns.factory.PizzaIngredientFactory;
import com.design.patterns.factory.PizzaStore;
import com.design.patterns.factory.pizza.CheesePizza;
import com.design.patterns.factory.pizza.ClamPizza;
import com.design.patterns.factory.pizza.VeggiePizza;
import com.design.patterns.factory.pizzaingredient.NYPizzaIngredientFactory;

public class NYStylePizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		// TODO Auto-generated method stub
		Pizza pizza = null;
		PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();
		if(type.equals("cheese")){
			pizza = new CheesePizza(pizzaIngredientFactory);
			pizza.setName("NY Style Cheese Pizza");
		} else if(type.equals("veggie")){
			pizza = new VeggiePizza(pizzaIngredientFactory);
			pizza.setName("NY Style Veggie Pizza");
		} else if(type.equals("clam")) {
			pizza = new ClamPizza(pizzaIngredientFactory);
			pizza.setName("NY Style Clam Pizza");
		} return pizza;
	}

}

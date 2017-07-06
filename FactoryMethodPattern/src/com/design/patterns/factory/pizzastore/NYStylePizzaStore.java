package com.design.patterns.factory.pizzastore;

import com.design.patterns.factory.Pizza;
import com.design.patterns.factory.PizzaStore;
import com.design.patterns.factory.pizza.NYStyleCheesePizza;
import com.design.patterns.factory.pizza.NYStyleClamPizza;
import com.design.patterns.factory.pizza.NYStyleVeggiePizza;

public class NYStylePizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		// TODO Auto-generated method stub
		if(type.equals("cheese")){
			return new NYStyleCheesePizza();
		} else if(type.equals("veggie")){
			return new NYStyleVeggiePizza();
		} else if(type.equals("clam")) {
			return new NYStyleClamPizza();
		} else return null;
	}

}

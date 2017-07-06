package com.design.patterns.factory.pizzastore;

import com.design.patterns.factory.Pizza;
import com.design.patterns.factory.PizzaStore;
import com.design.patterns.factory.pizza.ChicagoStyleCheesePizza;
import com.design.patterns.factory.pizza.ChicagoStyleClamPizza;
import com.design.patterns.factory.pizza.ChicagoStyleVeggiePizza;

public class ChicagoStylePizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		// TODO Auto-generated method stub
		if(type.equals("cheese")){
			return new ChicagoStyleCheesePizza();
		} else if(type.equals("veggie")){
			return new ChicagoStyleVeggiePizza();
		} else if(type.equals("clam")) {
			return new ChicagoStyleClamPizza();
		} else return null;
	}

}

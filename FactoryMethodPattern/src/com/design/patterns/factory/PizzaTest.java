package com.design.patterns.factory;

import com.design.patterns.factory.pizzastore.ChicagoStylePizzaStore;
import com.design.patterns.factory.pizzastore.NYStylePizzaStore;

public class PizzaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PizzaStore nyStore = new NYStylePizzaStore();
		PizzaStore chicagoStore = new ChicagoStylePizzaStore();
		
		nyStore.orderPizza("cheese");
		chicagoStore.orderPizza("veggie");
	}

}

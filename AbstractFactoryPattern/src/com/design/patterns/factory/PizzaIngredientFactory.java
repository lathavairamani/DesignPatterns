package com.design.patterns.factory;

import com.design.patterns.factory.pizzaingredient.Cheese;
import com.design.patterns.factory.pizzaingredient.Clam;
import com.design.patterns.factory.pizzaingredient.Dough;
import com.design.patterns.factory.pizzaingredient.Sauce;
import com.design.patterns.factory.pizzaingredient.Veggies;

public interface PizzaIngredientFactory {
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Clam createClam();
	public Veggies[] createVeggies();
}

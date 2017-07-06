package com.design.patterns.factory.pizzaingredient;

import com.design.patterns.factory.PizzaIngredientFactory;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	public Dough createDough() {
		// TODO Auto-generated method stub
		return new ThinCrustDough();
	}

	public Sauce createSauce() {
		// TODO Auto-generated method stub
		return new BuffaloSauce();
	}

	public Cheese createCheese() {
		// TODO Auto-generated method stub
		return new MozorellaCheese();
	}

	public Clam createClam() {
		// TODO Auto-generated method stub
		return new FreshClam();
	}

	public Veggies[] createVeggies() {
		// TODO Auto-generated method stub
		Veggies veggies[] = {new Garlic(), new RedOnion(), new Mushroom(), new Jalepeno()};
		return veggies;
	}

}

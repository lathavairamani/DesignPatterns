package com.design.patterns.factory.pizzaingredient;

import com.design.patterns.factory.PizzaIngredientFactory;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

	public Dough createDough() {
		// TODO Auto-generated method stub
		return new ThickCrustDough();
	}

	public Sauce createSauce() {
		// TODO Auto-generated method stub
		return new MarinaraSauce();
	}

	public Cheese createCheese() {
		// TODO Auto-generated method stub
		return new SheddarCheese();
	}

	public Clam createClam() {
		// TODO Auto-generated method stub
		return new FrozenClam();
	}

	public Veggies[] createVeggies() {
		// TODO Auto-generated method stub
		Veggies veggies[] = {new Garlic(), new RedOnion(), new Mushroom()};
		return veggies;
	}

	

}

package com.design.patterns;

import com.design.patterns.beverages.DeCaf;
import com.design.patterns.beverages.Expresso;
import com.design.patterns.beverages.HouseBlend;
import com.design.patterns.condiments.Mocha;
import com.design.patterns.condiments.Soy;
import com.design.patterns.condiments.Whip;

public class StarbuzzCoffee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Beverage beverage1 = new Expresso();
		System.out.println(beverage1.getDescription() + " - " + beverage1.cost());
		
		Beverage beverage2 = new HouseBlend();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		System.out.println(beverage2.getDescription() + " - " + beverage2.cost());
		
		Beverage beverage3 = new DeCaf();
		beverage3 = new Mocha(beverage3);
		beverage3 = new Soy(beverage3);
		beverage3 = new Whip(beverage3);
		System.out.println(beverage3.getDescription() + " - " + beverage3.cost());
		
	}

}

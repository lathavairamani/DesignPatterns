package com.design.patterns.template;

import com.design.patterns.template.beverage.Coffee;
import com.design.patterns.template.beverage.Tea;
import com.design.patterns.template.hook.CoffeeWithHook;
import com.design.patterns.template.hook.TeaWithHook;

public class TemplatePatternTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tea tea = new Tea();
		tea.prepareRecipe();
		
		Coffee coffee = new Coffee();
		coffee.prepareRecipe();
		
		TeaWithHook teaWithHook = new TeaWithHook();
		teaWithHook.prepareRecipe();
		
		CoffeeWithHook coffeeWithHook = new CoffeeWithHook();
		coffeeWithHook.prepareRecipe();
	}

}

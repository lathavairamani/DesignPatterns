package com.design.patterns.iterator;

import java.util.ArrayList;

public class IteratorPatternTest {
	public static void main(String[] args) {
		Menu panCakeHouseMenu = new PanCakeHouseMenu();
		Menu dinerMenu = new DinerMenu();
		Menu cafeMenu = new CafeMenu();
		ArrayList<Menu> menus = new ArrayList<Menu>();
		menus.add(cafeMenu);
		menus.add(dinerMenu);
		menus.add(panCakeHouseMenu);
		
		Waitress waitress = new Waitress(menus);
		waitress.printMenu();
	}
}

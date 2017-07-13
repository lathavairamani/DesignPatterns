package com.design.patterns.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Waitress {
	ArrayList<Menu> menus;
	
	public Waitress(ArrayList<Menu> menus) {
		this.menus = menus;
	}
	
	public void printMenu() {
		Iterator<Menu> menuIterator = menus.iterator();
		while(menuIterator.hasNext()){
			Menu menu = menuIterator.next();
			display(menu.createIterator());
		}
	}
	
	private void display(Iterator<MenuItem> menuItemsIterator){
		while(menuItemsIterator.hasNext()) {
			MenuItem menuItem = menuItemsIterator.next();
			String veg = menuItem.isVegeterian() ? "veg":"nonveg";
			System.out.println(menuItem.getName() + " " + menuItem.getPrice() + " " + menuItem.getDescription() + "(" + veg + ")");
		}
	}
}

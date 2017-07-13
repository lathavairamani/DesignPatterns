package com.design.patterns.iterator;

import java.util.HashMap;
import java.util.Iterator;

public class CafeMenu implements Menu {
	HashMap<String, MenuItem> menuItems = new HashMap<String, MenuItem>();
	
	public CafeMenu() {
		addItem("Pizza", "Chicken pizza with buffalo sauce", false, 10.99);
		addItem("Pasta", "Mushroom Pasta with cheddar cheese", true, 8.99);
		addItem("Burger", "Double Stack Steak Burger", false, 9.99);
	}

	private void addItem(String name, String description, boolean veg, double price) {
		// TODO Auto-generated method stub
		MenuItem menuItem = new MenuItem(name, description, veg, price);
		menuItems.put(name, menuItem);
	}

	@Override
	public Iterator<MenuItem> createIterator() {
		// TODO Auto-generated method stub
		return menuItems.values().iterator();
	}

}

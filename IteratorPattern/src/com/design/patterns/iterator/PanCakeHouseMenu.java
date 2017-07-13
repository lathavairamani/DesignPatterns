package com.design.patterns.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class PanCakeHouseMenu implements Menu {
	
	public ArrayList<MenuItem> menuItems;
	
	public PanCakeHouseMenu() {
		menuItems = new ArrayList<MenuItem>();
		addItem("RedVelvetPanCake", "Red Velvet Flavor with Cream", true, 3.99);
		addItem("ChocolateChipPanCake", "Chocolate Flavor with chocolate chips", true, 3.99);
		addItem("ButterMilkPanCake", "Traditional Butter Milk Flavor", true, 2.99);
	}

	private void addItem(String name, String description, boolean vegeterian, double price) {
		// TODO Auto-generated method stub
		MenuItem menuItem = new MenuItem(name, description, vegeterian, price);
		menuItems.add(menuItem);
	}

	@Override
	public Iterator<MenuItem> createIterator() {
		// TODO Auto-generated method stub
		return menuItems.iterator();
	}

}

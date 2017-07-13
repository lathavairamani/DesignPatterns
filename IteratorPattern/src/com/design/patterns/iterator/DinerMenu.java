package com.design.patterns.iterator;

import java.util.Iterator;

public class DinerMenu implements Menu {
	
	static final int MAX = 6;
	int numberOfItems = 0;
	MenuItem[] menuItems;
	
	public DinerMenu() {
		menuItems = new MenuItem[MAX];
		addItem("Chicken Chipotle", "Grilled chicken breast with chipotle sauce", false, 10.99);
		addItem("Choripolo", "Grillen chicken topped with chorizo", false, 11.99);
		addItem("Veg Fajitas", "Grilled vegetables", true, 8.99);
	}

	private void addItem(String name, String description, boolean vegeterian, double price) {
		// TODO Auto-generated method stub
		MenuItem menuItem = new MenuItem(name, description, vegeterian, price);
		if(numberOfItems >= MAX) {
			System.out.println("Menu is full");
		} else {
			menuItems[numberOfItems] = menuItem;
			numberOfItems++;
		}
	}

	@Override
	public Iterator<MenuItem> createIterator() {
		// TODO Auto-generated method stub
		return new DinerMenuIterator(menuItems);
	}

}

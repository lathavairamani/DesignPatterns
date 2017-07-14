package com.design.patterns.composite;

import java.util.Iterator;

public class Waitress {
	MenuComponent allMenus;
	
	public Waitress(MenuComponent allMenus) {
		this.allMenus = allMenus;
	}
	
	public void printMenu() {
		allMenus.print();
	}
	
	public void printVegeterianMenu() {
		Iterator<MenuComponent> iterator = allMenus.createIterator();
		System.out.println("\n Vegeterian Menu\n----");
		while(iterator.hasNext()) {
			MenuComponent menuComponent = iterator.next();
			try {
				if(menuComponent.isVegeterian()) {
					menuComponent.print();
				} 
			} catch(UnsupportedOperationException e) {}
		}
	}
	
}

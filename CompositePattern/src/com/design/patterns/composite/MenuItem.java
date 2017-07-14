package com.design.patterns.composite;

import java.util.Iterator;

public class MenuItem extends MenuComponent {
	String name;
	String description;
	double price;
	boolean vegeterian;
	
	public MenuItem(String name, String description, boolean vegeterian, double price) {
		this.name = name;
		this.description = description;
		this.price = price;
		this.vegeterian = vegeterian;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public double getPrice() {
		return price;
	}

	public boolean isVegeterian() {
		return vegeterian;
	}
	
	public void print() {
		System.out.print(" " + getName());
		if(isVegeterian()){
			System.out.print("(v)");
		}
		System.out.println(", " + getPrice());
		System.out.println("  -- " + getDescription());
	}
	
	public Iterator<MenuComponent> createIterator() {
		return new NullIterator();
	}
}

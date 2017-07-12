package com.design.patterns.template.arrays.sort;

import java.util.Arrays;

public class DuckSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck[] ducks = {
				new Duck("Abhishek", 7),
				new Duck("Mithun", 8),
				new Duck("Krishna", 8),
				new Duck("Madhan", 6),
				new Duck("Sarvesh", 5)
		};
		
		System.out.println("Before sorting..");
		display(ducks);
		
		Arrays.sort(ducks);
		
		System.out.println("After sorting...");
		display(ducks);
	}
	
	public static void display(Duck[] ducks) {
		for (Duck duck : ducks){
			System.out.println(duck);
		}
	}

}

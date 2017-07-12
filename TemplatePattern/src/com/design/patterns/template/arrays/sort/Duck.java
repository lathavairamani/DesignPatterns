package com.design.patterns.template.arrays.sort;

public class Duck implements Comparable<Object>{
	
	String name;
	int age;
	
	public Duck(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return name + " age is " + age;
	}

	@Override
	public int compareTo(Object obj) {
		// TODO Auto-generated method stub
		Duck otherDuck = (Duck)obj;
		if(this.age < otherDuck.age){
			return -1;
		} else if(this.age == otherDuck.age){
			return 0;
		} else {
			return 1;
		}
	}

}

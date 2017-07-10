package com.design.patterns.command.vendor;

public class Fan {

	String location;
	int speed;
	// Have to implement different command classes for speed levels
	public static final int HIGH = 3;
	public static final int MEDIUM = 2;
	public static final int LOW = 1;
	public static final int OFF = 0;
	
	public Fan(String location) {
		this.location = location;
		speed = OFF;
	}
	
	public void high() {
		speed = HIGH;
		System.out.println("Setting high speed");
	}
	
	public void medium() {
		speed = MEDIUM;
		System.out.println("Setting medium speed");
	}
	
	public void low() {
		speed = LOW;
		System.out.println("Setting low speed");
	}
	
	public void on(){
		System.out.println(location + " Fan switched on");
		speed = HIGH;
	}
	
	public void off(){
		System.out.println(location + " Fan switched off");
		speed = OFF;
	}

	public int getSpeed() {
		// TODO Auto-generated method stub
		return speed;
	}
	
}

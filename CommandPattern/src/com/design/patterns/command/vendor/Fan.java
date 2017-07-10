package com.design.patterns.command.vendor;

public class Fan {

	String location;
	public Fan(String location) {
		this.location = location;
	}
	
	public void on(){
		System.out.println(location + " Fan switched on");
	}
	
	public void off(){
		System.out.println(location + " Fan switched off");
	}
	
}

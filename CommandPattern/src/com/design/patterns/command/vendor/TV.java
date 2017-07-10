package com.design.patterns.command.vendor;

public class TV {
	String location;
	
	public TV(String location) {
		this.location = location;
	}
	
	public void on() {
		System.out.println(location + " TV switched on");
	}
	
	public void off() {
		System.out.println(location + " TV switched off");
	}
	
}

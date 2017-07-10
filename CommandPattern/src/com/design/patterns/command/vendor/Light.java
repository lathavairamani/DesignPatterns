package com.design.patterns.command.vendor;

public class Light {
	
	String location;
	
	public Light(String location){
		this.location = location;
	}
	public void on(){
		System.out.println(location + " Light switched on");
	}
	
	public void off(){
		System.out.println(location + " Light switched off");
	}
}

package com.design.patterns.command.vendor;

public class Garage {
	
	String location;
	
	public Garage(String location){
		this.location = location;
	}
	
	public void open(){
		System.out.println(location + " Garage Door opened");
	}
	
	public void close(){
		System.out.println(location + " Garage Door closed");
	}
}

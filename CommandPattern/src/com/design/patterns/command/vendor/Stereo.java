package com.design.patterns.command.vendor;

public class Stereo {
	String location;
	
	public Stereo(String location) {
		this.location = location;
	}
	
	public void on(){
		System.out.println(location + " Stereo switched on");
	}
	
	public void off() {
		System.out.println(location + " Stereo switched off");
	}
	
	public void setCD() {
		System.out.println("CD inserted");
	}
	
	public void setVolume() {
		System.out.println("Volume increased");
	}
}

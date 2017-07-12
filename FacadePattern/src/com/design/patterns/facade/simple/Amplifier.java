package com.design.patterns.facade.simple;

public class Amplifier {
	public void on(){
		System.out.println("Amplifier is on");
	}
	
	public void setDvd(DVDPlayer dvd){
		System.out.println("Inserted DVD");
	}
	
	public void setSurroundSound(){
		System.out.println("Surround Sound");
	}
	
	public void setVolume(int volume){
		System.out.println("Volume is set " + volume);
	}
	
	public void off() {
		System.out.println("Amplifier off");
	}
}

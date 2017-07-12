package com.design.patterns.facade.simple;

public class DVDPlayer {

	public void on(){
		System.out.println("DVD Player is on");
	}
	
	public void play(String movie){
		System.out.println("Movie started - " + movie);
	}
	
	public void stop() {
		System.out.println("Stopping DVD");
	}
	
	public void eject() {
		System.out.println("Ejecting DVD");
	}
	
	public void off() {
		System.out.println("DVD Player off");
	}
	
}

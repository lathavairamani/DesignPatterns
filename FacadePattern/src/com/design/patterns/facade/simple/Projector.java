package com.design.patterns.facade.simple;

public class Projector {
	public void on() {
		System.out.println("Projector switched on");
	}
	
	public void setInput(DVDPlayer dvd) {
		System.out.println("DVD inserted");
	}
	
	public void wideScreenMode() {
		System.out.println("Setting wide Screen Mode");
	}
	
	public void off() {
		System.out.println("Switched off projector");
	}
}

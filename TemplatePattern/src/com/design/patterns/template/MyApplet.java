package com.design.patterns.template;

import java.applet.Applet;
import java.awt.Graphics;

public class MyApplet extends Applet {
	
	String message;
	
	// Hook in Applet
	public void init() {
		message = "I am my init";
		repaint(); // concrete method in the Applet
	}
	
	// Hook in Applet
	public void start() {
		message = "This is my start";
		repaint();
	}
	
	// Hook in Applet
	public void stop(){
		message = "This is my stop";
		repaint();
	}
	
	// Hook in Applet
	public void destroy() {
		message = "I am going away";
	}

	// Hook in Applet
	public void paint(Graphics g) {
		g.drawString(message, 5, 15);
	}
	
	public static void main(String[] args) {
		MyApplet app = new MyApplet();
		app.init();
		app.start();
		app.stop();
	}
}

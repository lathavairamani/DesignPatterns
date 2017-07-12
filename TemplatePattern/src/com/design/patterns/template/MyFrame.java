package com.design.patterns.template;

import java.awt.Graphics;

import javax.swing.JFrame;

public class MyFrame extends JFrame{
	
	public MyFrame(String title) {
		super(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300, 300);
		this.setVisible(true);
	}
	
	// JFrame's update algorithm calls paint(). By default paint() does nothing. It's a hook.
	// Here we are overriding and telling to draw a message on the window.
	public void paint (Graphics graphics) {
		super.paint(graphics);
		String msg = "My Frame";
		graphics.drawString(msg, 100, 100);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame myFrame = new MyFrame("Template Pattern");
	}

}

package com.design.patterns.mvc.view;

import javax.swing.JProgressBar;

public class BeatBar extends JProgressBar implements Runnable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JProgressBar progressBar;
	Thread thread;
	
	public BeatBar() {
		this.thread = new Thread(this);
		setMaximum(100);;
		thread.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(;;) {
			int value = getValue();
			value = (int)(value*.75);
			setValue(value);
			repaint();
			try {
				Thread.sleep(50);
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}

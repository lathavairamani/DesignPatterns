package com.design.patterns.proxy.cd.cover;

import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;

import javax.swing.ImageIcon;

public class ImageProxy implements Icon {
	volatile ImageIcon icon;
	final URL imageURL;
	Thread retrievalThread;
	boolean retrieving = false;
	
	public ImageProxy(URL url) {
		this.imageURL = url;
	}

	@Override
	public int getIconWidth() {
		// TODO Auto-generated method stub
		if(icon != null) {
			return icon.getIconWidth();
		} else {
			return 800;
		}
	}

	@Override
	public int getIconHeight() {
		// TODO Auto-generated method stub
		if(icon != null) {
			return icon.getIconHeight();
		} else {
			return 600;
		}
	}

	@Override
	public void paintIcon(final Component c, Graphics g, int x, int y) {
		// TODO Auto-generated method stub
		if(icon != null) {
			icon.paintIcon(c, g, x, y);
		} else {
			g.drawString("Loading CD cover, please wait...", x+300, y+190);
			if(!retrieving) {
				retrieving = true;
				retrievalThread = new Thread(new Runnable(){
					public void run() {
						try {
							setIcon(new javax.swing.ImageIcon(imageURL, "CD Cover"));
							c.repaint();
						} catch(Exception e) {
							e.printStackTrace();
						}
					}
				});
				retrievalThread.start();
			}
		}
	}

	synchronized public void setIcon(ImageIcon icon) {
		this.icon = icon;
	}

}

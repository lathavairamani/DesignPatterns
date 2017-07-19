package com.design.patterns.proxy.cd.cover;

import java.awt.Component;
import java.awt.Graphics;

public interface Icon {
	public int getIconWidth();
	public int getIconHeight();
	public void paintIcon(Component c, Graphics g, int x, int y);
}

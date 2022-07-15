package com.brostagma;

import java.awt.Graphics;
import java.awt.Rectangle;

public class MyRectangle {

	Rectangle r;
	
	public MyRectangle(int x, int y, int w, int h) {
		r = new Rectangle(x, y, w, h);
	}
	
	public void drawRectangle(Graphics g) {
		g.drawRect((int)r.getX(),(int)r.getY(),(int)r.getWidth(),(int)r.getHeight());
	}
	
	public void moveRectangle(int x, int y) {
		
		r.setLocation((int)r.getX() + x,(int)r.getY() + y);
	}
	
	
}

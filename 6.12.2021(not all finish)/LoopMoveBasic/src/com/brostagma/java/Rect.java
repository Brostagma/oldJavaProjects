package com.brostagma.java;

import java.awt.Color;
import java.awt.Graphics;

public class Rect extends Physics {

	private int width = 30,height = 30,x = 145,y = 450;

	public void drawRect(Graphics g) {
		
		g.setColor(Color.black);
		g.fillRect(x, y, width, height);
	}
	
	public void moveRect() {
		
		y = y + checkWindowPhysics(height,y);
		
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
}

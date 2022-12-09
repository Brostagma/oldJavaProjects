package com.brostagma.java;

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Physics {
	
	private int width = 30,height = 30,x = 110,y = 0;

	public void drawBall(Graphics g) {
		
		g.setColor(Color.black);
		g.fillOval(x, y, width, height);
	}
	
	public void moveBall() {
		
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

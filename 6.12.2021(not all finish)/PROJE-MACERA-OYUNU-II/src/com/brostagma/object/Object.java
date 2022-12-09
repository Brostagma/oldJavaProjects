package com.brostagma.object;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public abstract class Object {
	
	private Rectangle rect;
	private Color color;
	private String ObjectName;
	private int ObjectNo;
	private int X;
	private int Y;
	private int Width;
	private int Height;
	
	public abstract void drawObject(int x, int y, int w, int h, Graphics g, Color color);
	
	public String getObjectName() {
		return ObjectName;
	}

	public void setObjectName(String objectName) {
		this.ObjectName = objectName;
	}

	public int getObjectNo() {
		return ObjectNo;
	}

	public void setObjectNo(int objectNo) {
		this.ObjectNo = objectNo;
	}

	public int getX() {
		return X;
	}

	public void setX(int x) {
		this.X = x;
	}

	public int getY() {
		return Y;
	}

	public void setY(int y) {
		this.Y = y;
	}

	public int getWidth() {
		return Width;
	}

	public void setWidth(int width) {
		this.Width = width;
	}

	public int getHeight() {
		return Height;
	}

	public void setHeight(int height) {
		this.Height = height;
	}
	
	public Rectangle getRect() {
		return rect;
	}

	public void setRect(Rectangle rect) {
		this.rect = rect;
	}
	
	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}


}

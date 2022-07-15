package com.brostagma.object;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Market extends Object {

	private final String objectName = "Market";
	private final int objectNo = 1;
	private Rectangle rect;
	
	public Market() {
		// TODO Auto-generated constructor stub
		rect = new Rectangle();
	}
	
	@Override
	public void drawObject(int x, int y, int w, int h, Graphics g, Color color) {
		// TODO Auto-generated method stub
		rect.x = x;
		rect.y = y;
		rect.width = w;
		rect.height = h;
		setObjectName(objectName);
		setObjectNo(objectNo);
		setColor(color);
		setRect(rect);
		g.setColor(color);
		g.fillRect((int)rect.x, (int)rect.y, (int)rect.width, (int)rect.height);
	}

}

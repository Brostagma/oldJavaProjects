package com.brostagma.object;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;

public class Player extends Object {
	
//	private int x,y,w,h;
	private final String objectName = "Player";
	private final int objectNo = 0;
	private Rectangle rect;
	
	public Player() {
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
	
	public void movePlayer(KeyEvent e) {
		
		if(e.getKeyCode() == KeyEvent.VK_W) {
			rect.setLocation((int)rect.getX(), (int)rect.getY() - 5);
			System.out.println("worked");
		}
		
	}
	
}

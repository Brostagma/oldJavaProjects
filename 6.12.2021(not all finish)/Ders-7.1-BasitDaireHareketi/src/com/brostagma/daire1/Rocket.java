package com.brostagma.daire1;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;

public class Rocket {

	private Application app;
	private int x = 0;
	private int xa = 0;
	private int y = 330;
	private int width = 60;
	private int height = 10;
	
	public Rocket(Application app) {
		// TODO Auto-generated constructor stub
		this.app = app;
	}
	
	public void moveRocket() {
		// TODO Auto-generated method stub
		if(x + xa > 0 && x + xa < app.getWidth() - 60) {
			x += xa;
		}
	}
	
	public void paint(Graphics2D g) {
		g.fillRect(x, y, width, height);
	}
	
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_D) {
			xa = 1;
		}
		else if(e.getKeyCode() == KeyEvent.VK_A) {
			xa = -1;
		}
	}
	
	public void keyReleased(KeyEvent e) {
		xa = 0;
	}
	
	public Rectangle getBounds() {
		return new Rectangle(x, y, width, height);
	}
	
	public int getY() {
		return this.y;
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getWidth() {
		return this.width;
	}
	
	public int getHeight() {
		return this.height;
	}
}

package com.brostagma.daire1;

import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Ball {

	private Application app;
	private int x = 0,y = 0;
	private int xa = 1, ya = 1;
	private int size = 30;
	
	public Ball(Application app) {
		// TODO Auto-generated constructor stub
		this.app = app;
	}
	
	public void moveBall() {
		if(y + ya > app.getHeight() - 45) {
			System.err.println("Game Over");
			app.setRun(false);
		}
		if(x + xa < 0) {
			xa = 1;
		}
		if(x + xa > app.getWidth() - 30) {
			xa = -1;
		}
		if(coll()) {
				ya = -1;
		}
		
		
		if(y + ya < 0) {
			ya = 1;
		}
		
		
		x += xa;
		y += ya;
	}
	
	public boolean coll() {
		return this.app.rocket.getBounds().intersects(getBounds());
	}
	
	public void paint(Graphics2D g) {
		g.fillOval(x, y, 30, 30);
	}
	
	public Rectangle getBounds() {
		return new Rectangle(x, y, size, size);
	}
}

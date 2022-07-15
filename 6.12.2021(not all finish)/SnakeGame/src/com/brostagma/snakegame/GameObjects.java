package com.brostagma.snakegame;

import java.awt.Graphics;
import java.util.Random;

public class GameObjects {

	
	GameRender gameRender = new GameRender();
	Display display = new Display();
	Random random;
	
	private final int x[] = new int[gameRender.getUnitCount()];
	private final int y[] = new int[gameRender.getUnitCount()];
	private int bodyParts = 6;
	private int appleX,appleY;
	
	
			
	public GameObjects() {
		// TODO Auto-generated constructor stub
		
		
	}
	
	public void Apple() {
		// TODO Auto-generated method stub

	}
	
	public void newApple(Graphics g) {
		random = new Random();
		appleX = random.nextInt((int)(display.getHEIGHT() / gameRender.getUnitSize()*gameRender.getUnitSize()));
		appleY = random.nextInt((int)(display.getWIDTH() / gameRender.getUnitSize()*gameRender.getUnitSize()));
		g.fillOval(appleX, appleY, gameRender.getUnitSize(), gameRender.getUnitSize());
	}
}

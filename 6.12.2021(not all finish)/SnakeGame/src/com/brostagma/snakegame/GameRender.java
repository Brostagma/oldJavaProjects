package com.brostagma.snakegame;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.Timer;


public class GameRender {
	
	GameObjects gameObjects;
	Display display = new Display();
	Timer timer;
	
	private final int unitSize = 25;
	private final int unitCount = (display.getWIDTH()*display.getHEIGHT())/unitSize;
	private final int delay = 75;
	private boolean running = false;

	public GameRender() {
		// TODO Auto-generated constructor stub
		startGame();
	}
	
	public void startGame() {
//		gameObjects.newApple();
		setRunning(true);
		timer = new Timer(delay, new GameController());
		timer.start();
	}
	
	
	public void draw(Graphics g) {
		g.setColor(Color.blue);
		for(int i = 0; i < (display.getWIDTH() / unitSize)+1; i++) {
			g.drawLine(i*unitSize, 0, i*unitSize, display.getHEIGHT());
			g.drawLine(0, i*unitSize, display.getWIDTH(), i*unitSize);
		}
		g.setColor(Color.red);
		new GameObjects().newApple(g);
	}
	
	public int getUnitSize() {
		return unitSize;
	}
	
	public int getUnitCount() {
		return unitCount;
	}

	public boolean isRunning() {
		return running;
	}

	public void setRunning(boolean running) {
		this.running = running;
	}
}

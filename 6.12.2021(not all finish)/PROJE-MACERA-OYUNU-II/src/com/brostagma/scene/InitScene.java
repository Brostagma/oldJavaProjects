package com.brostagma.scene;

import java.awt.Color;
import java.awt.Graphics;

import com.brostagma.object.Market;
import com.brostagma.object.Player;

public class InitScene {
	
	private Player player;
	private Market market;
	
	public InitScene() {
		// TODO Auto-generated constructor stub
		player = new Player();
		market = new Market();
	}
	
	public void initScene(Graphics g) {
		player.drawObject(60, 325, 100, 100, g, Color.black);
		market.drawObject(600, 300, 150, 150, g, Color.green);
	}

}

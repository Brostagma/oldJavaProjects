package com.brostagma.scene.controller;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import com.brostagma.object.Player;

public class Controller extends KeyAdapter{

	Player player;
	public Controller() {
		// TODO Auto-generated constructor stub
		player = new Player();
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		super.keyPressed(e);
		player.movePlayer(e);
		
	}

	
}

package com.brostagma;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@SuppressWarnings("serial")
public class Board extends Canvas implements KeyListener {

	Dimension dimension;
	Color color;
	
	NPCObjects npc;
	Player player;
	private boolean initObjectCheck = true;
	
	public Board(String args[]) {
		initUI();
	}

	private void initUI() {
		// TODO Auto-generated method stub
		npc = new NPCObjects();
		player = new Player();
		dimension = new Dimension(600, 600);
		color = Color.gray;
		setPreferredSize(dimension);
		setBackground(color);
		addKeyListener(this);
	}
	
	private void createObject(Graphics g) {
		npc.NPCSafe(g);
		npc.NPCArmor(g);
		npc.NPCWar(g);
		player.drawPlayer(g);
	}
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		createObject(g);
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode() == KeyEvent.VK_W) {
			player.movePlayer(0, -5);
		}
		else if(e.getKeyCode() == KeyEvent.VK_S) {
			player.movePlayer(0, 5);
		}
		else if(e.getKeyCode() == KeyEvent.VK_A) {
			player.movePlayer(-5, 0);
		}
		else if(e.getKeyCode() == KeyEvent.VK_D) {
			player.movePlayer(5, 0);
		}
		
		if(e.getKeyCode() == KeyEvent.VK_SPACE) {
//			System.out.println("Name: " + player.getObjectName(0));
//			System.out.println("No: " + player.getObjectNo(0));
		}
		new NPCSafe().talkKey(e);
		repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}

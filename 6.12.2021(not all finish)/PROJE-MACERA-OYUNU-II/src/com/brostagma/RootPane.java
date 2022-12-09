package com.brostagma;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import com.brostagma.object.Market;
import com.brostagma.object.Player;
import com.brostagma.scene.InitScene;
import com.brostagma.scene.controller.Controller;

@SuppressWarnings("serial")
public class RootPane extends Canvas implements KeyListener{
	
	private int WIDTH = 800, HEIGHT = 650;
	
	private Player player;
	private Market market;
	private InitScene initScene;
	private Controller control;
	
	public RootPane() {
		// TODO Auto-generated constructor stub
	}

	public Component initUI() {
		// TODO Auto-generated method stub
		initScene = new InitScene();
		control = new Controller();
		addKeyListener(this);
		setBackground(Color.gray);
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		return this;
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		initScene.initScene(g);
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		super.addKeyListener(control);
		repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}

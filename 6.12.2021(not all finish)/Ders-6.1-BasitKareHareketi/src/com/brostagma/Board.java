package com.brostagma;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Board extends JPanel implements KeyListener {

	private final int WIDTH = 600;
	private final int HEIGHT = 600;
	MyRectangle rect;
	
	public Board() {
		super();
		rect = new MyRectangle(200, 200, 50, 50);
		addKeyListener(this);
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
	}

	@Override
	public void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		System.out.println("drawed");
		rect.drawRectangle(g);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getKeyCode() == KeyEvent.VK_W) {
			System.err.println("up");
			rect.moveRectangle(0, -5);
			setBackground(Color.red);
		}
		else if(e.getKeyCode() == KeyEvent.VK_S) {
			System.err.println("down");
			rect.moveRectangle(0, +5);
			setBackground(Color.green);
		}
		else if(e.getKeyCode() == KeyEvent.VK_D) {
			System.err.println("right");
			rect.moveRectangle(+5, 0);
			setBackground(Color.cyan);
		}
		else if(e.getKeyCode() == KeyEvent.VK_A) {
			System.err.println("left");
			rect.moveRectangle(-5, 0);
			setBackground(Color.blue);
		}
		else if(e.getKeyCode() == KeyEvent.VK_E) {
			System.err.println("up-right");
			rect.moveRectangle(+5, -5);
			setBackground(Color.pink);
		}
		
		repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}

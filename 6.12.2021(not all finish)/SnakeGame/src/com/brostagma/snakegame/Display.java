package com.brostagma.snakegame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Display extends JPanel implements ActionListener{

	private static final long serialVersionUID = 1L;
	
	GameRender gameRender;
	
	static JFrame frame;
	private Color bgColor = Color.black;
	
	private String title = "Snake Game Alpha-0.1";
	private static final int WIDTH = 600;
	private static final int HEIGHT = 600;

	public Display() {
		
	}
	public Display(String[] args) {
		// TODO Auto-generated constructor stub
		this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
		this.setBackground(bgColor);
		Display.frame = new JFrame();
		Display.frame.setUndecorated(false);
		Display.frame.setTitle(title);
		Display.frame.add(this);
		Display.frame.pack();
		Display.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		Display.frame.setResizable(false);
		Display.frame.setLocationRelativeTo(null);
		Display.frame.setFocusable(true);
		Display.frame.addKeyListener(new GameController());
		Display.frame.setVisible(true);
		new GameRender();
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		gameRender = new GameRender();
		gameRender.draw(g);
	}
	
	public int getWIDTH() {
		return WIDTH;
	}
	
	public int getHEIGHT() {
		return HEIGHT;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}

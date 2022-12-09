package com.brostagma;

import java.awt.EventQueue;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Application extends JFrame {
	
	private final String title = "OOP";
	private Board board;
	
	public Application(String args[]) {
		board = new Board(args);
		add(board);
		addKeyListener(board);
		pack();
		setTitle(title);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		
		
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				Application app = new Application(args);
				app.setVisible(true);
			}
		});
	}
}

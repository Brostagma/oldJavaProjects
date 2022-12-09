package com.brostagma;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class Application extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private final int WIDTH = 600;
	private final int HEIGHT = 600;
	
	private final String title = "Basic Starter";
	
	public Application() {
		initUI();
	}
	
	private void initUI() {
		add(new Board());
		setSize(WIDTH,HEIGHT);
		setTitle(title);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				Application application = new Application();
				application.setVisible(true);
			}
		});
	}

}

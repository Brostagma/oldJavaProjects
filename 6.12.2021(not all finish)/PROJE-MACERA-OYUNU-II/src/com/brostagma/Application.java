package com.brostagma;

import java.awt.EventQueue;

import javax.swing.JFrame;


public class Application extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private final String title = "MACERA OYUNU II";
	private RootPane root;

	public Application() {
		// TODO Auto-generated constructor stub
		root = new RootPane();
		setTitle(title);
		add(root.initUI());
		pack();
//		setExtendedState(MAXIMIZED_BOTH);
//		setUndecorated(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				Application app = new Application();
				app.setVisible(true);
			}
		});
	}
	
}

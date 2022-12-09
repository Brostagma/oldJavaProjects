package com.brostagma;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

@SuppressWarnings("serial")
public class Application extends JFrame {

	private final String title = "Kare Hareketi Alpha 1.0";
	Board panel;
	
	public Application() {
		super();
		
		panel = new Board();
		add(panel);
		addKeyListener(panel);
		pack();
		setTitle(title);
		setResizable(false);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
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

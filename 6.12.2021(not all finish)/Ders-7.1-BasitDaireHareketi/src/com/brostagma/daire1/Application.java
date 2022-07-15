package com.brostagma.daire1;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Application extends JPanel {

	private Ball ball = new Ball(this);
	public Rocket rocket = new Rocket(this);
	private boolean run = true;
	
	public Application() {
		addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				rocket.keyReleased(e);
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				rocket.keyPressed(e);
			}
		});
		setFocusable(true);
	}
	
	public void move() {
		ball.moveBall();
		rocket.moveRocket();
	}
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		ball.paint(g2d);
		rocket.paint(g2d);
	}
	
	public static void main(String[] args) throws InterruptedException {
		JFrame frame = new JFrame();
		Application app = new Application();
		frame.add(app);
		frame.setSize(300,400);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		app.running();
	}
	
	private void running() throws InterruptedException {
		while(run) {
			move();
			repaint();
			Thread.sleep(10);
		}
	}
	
	public void setRun(boolean run) {
		this.run = run;
	}
	
	public boolean getRun() {
		return this.run;
	}
}

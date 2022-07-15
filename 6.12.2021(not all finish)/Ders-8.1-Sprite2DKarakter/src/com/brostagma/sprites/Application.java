package com.brostagma.sprites;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.ImageObserver;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Application extends Canvas implements KeyListener {
	
	Application app;
	
	int x = 10;
	int y = 10;
	
	int index = 0;
	public int a = 4;
	String[] images = new String[2];
	boolean load = true;
	boolean door = false;
	boolean check = true;
	String doorTip = "Press 'E' and open door!";
	
	Image wait;
	ImageObserver leylek;

	public Application() {
		// TODO Auto-generated constructor stub
		images[0] = "./source/wait1.png";
		images[1] = "./source/wait2.png";
		
		addKeyListener(this);
		setFocusable(true);
		
		//
		
		
		
	}
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		wait = Toolkit.getDefaultToolkit().getImage(images[index]);
		g2d.drawImage(wait,x,y, this);
		g2d.fillRect(250, 0, 10, 100);
		g2d.drawString(doorTip, 250, 130);
	}
	
	private void move() throws InterruptedException {

		
		if(check) {
			if(index + 1 == 2) {
				index = 0;
			}
			else {
				index++;
			}
			Thread.sleep(300);
		}
		
	}
	
	private void Coll() {
		if((x + 72) > 250 + 10 && door == false) {
			load = false;
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		Application app = new Application();
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
				JFrame frame = new JFrame();
				app.setPreferredSize(new Dimension(500, 150));
				frame.add(app);
				frame.pack();
				frame.setLocationRelativeTo(null);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
				 
			}
		});
		app.running(app);
		
	}
	
	private void running(Application app) throws InterruptedException {
		this.app = app;
		while(true) {
			
			app.repaint();
			app.move();
			app.Coll();
			Thread.sleep(10);
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode() == KeyEvent.VK_W && load == true) {
			check = false;
			x += 5;
		}
		if(e.getKeyCode() == KeyEvent.VK_E && load == false) {
			door = true;
			load = true;
			doorTip = "YAY! is door open GO!!!";
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		check = true;
	}
}

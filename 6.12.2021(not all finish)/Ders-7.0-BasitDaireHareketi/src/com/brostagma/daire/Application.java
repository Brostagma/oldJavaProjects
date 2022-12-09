package com.brostagma.daire;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Application extends JPanel {
	
	int x = 0;
	int y = 0;
	int xa = 1;
	int ya = 1;
	
	public void moveBall() {
		
		if(this.x + xa < 0) {
			xa = +1;
		}
		if(this.y + ya < 0) {
			ya = +1;
		}
		if(this.x + xa > getWidth() - 50) {
			xa = -1;
		}
		if(this.y + ya > getHeight() - 50) {
			ya = -1;
		}
		
		this.x += xa;
		this.y += ya;
	}
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.fillOval(x, y, 50, 50);
	}

	public static void main(String[] args) throws InterruptedException {
		JFrame frame = new JFrame();
		Application app = new Application(); 
		frame.add(app);
		frame.setSize(300, 400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		while(true) {
			app.moveBall();
			app.repaint();
			Thread.sleep(10);
		}
	}
	
}

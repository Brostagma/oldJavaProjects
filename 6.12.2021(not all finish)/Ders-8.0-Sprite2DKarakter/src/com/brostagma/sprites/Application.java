package com.brostagma.sprites;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.Toolkit;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Application extends Canvas {
	
	Application app;
	
	int x = 30;
	int y = 30;
	
	int index = 0;
	public int a = 4;
	String[] images = new String[10];
	String[] deadimage = new String[10];
	boolean visible;
	int load = 0;

	public Application() {
		// TODO Auto-generated constructor stub
		images[0] = "./source/char_1.png";
		images[1] = "./source/char_2.png";
		images[2] = "./source/char_3.png";
		images[3] = "./source/char_4.png";
		images[4] = "./source/char_5.png";
		images[5] = "./source/char_6.png";
		images[6] = "./source/char_7.png";
		images[7] = "./source/char_8.png";
		images[8] = "./source/char_9.png";
		images[9] = "./source/char_10.png";
		
		//
		
		deadimage[0] = "./source/dead/dead__000.png";
		deadimage[1] = "./source/dead/dead__001.png";
		deadimage[2] = "./source/dead/dead__002.png";
		deadimage[3] = "./source/dead/dead__003.png";
		deadimage[4] = "./source/dead/dead__004.png";
		deadimage[5] = "./source/dead/dead__005.png";
		deadimage[6] = "./source/dead/dead__006.png";
		deadimage[7] = "./source/dead/dead__007.png";
		deadimage[8] = "./source/dead/dead__008.png";
		deadimage[9] = "./source/dead/dead__009.png";
		
	}
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		if(visible == true) {
			Graphics2D g2d = (Graphics2D) g;
			g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
			Image run = Toolkit.getDefaultToolkit().getImage(images[index]);
			g2d.drawImage(run,x,y, this);
			Image dead = Toolkit.getDefaultToolkit().getImage(deadimage[index]);
			g2d.drawImage(dead,200,200, this);
		}
		else {
			Graphics2D g2d = (Graphics2D) g;
			g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
			Image run = Toolkit.getDefaultToolkit().getImage(images[index]);
			g2d.drawImage(run,x,y, this);
			Image dead = Toolkit.getDefaultToolkit().getImage(deadimage[index]);
			g2d.drawImage(dead,200,200, this);
			g2d.fillRect(0, 0, app.getWidth(), app.getHeight());
		}
		
		
	}
	
	private void move() {
		if(x + 1 > app.getWidth() - 72) {
			x = 0;
			a = 0;
		}
//		for(this.a = 0; a < 10; a++) {
//			index++;
//			x += 1;
//			load++;
//			if(index == 9) {
//				index = 0;
//			}
//		}
		if(index + 1 == 10) {
			index = 0;
		}
		index++;
		x += 10; 
		
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		Application app = new Application();
		app.repaint();
		JFrame frame = new JFrame();
		app.visible = true;
		frame.add(app);
		frame.setSize(1440,1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		app.running(app); 
	}
	
	private void running(Application app) throws InterruptedException {
		this.app = app;
		while(true) {
			app.repaint();
			app.move();
			Thread.sleep(230);
		}
	}
}

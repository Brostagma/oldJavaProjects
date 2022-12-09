package lesson_four;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;
import javax.swing.JFrame;

public class MyWindow extends JFrame implements MouseListener, KeyListener {

	private Random rnd;
	
	private int x1, y1, x2, y2;
	
	private String article;
	
	public MyWindow() {
		
		super();
		rnd = new Random();
		addMouseListener(this);
		addKeyListener(this);
		//article = "Hello!";
		article = "";
	}
	
	@Override
	public void paint(Graphics g) {
		
		super.paint(g);
		
		g.drawLine(x1, y1, x2, y2);
		g.drawString(article, x1, y1);
		g.drawRect(160, 120, 120, 120);
		//g.drawLine(0, 0, 240, 240);
		/*
		for(int i = 0; i < 10000; i++) {
			
			g.drawLine(rnd.nextInt(640), rnd.nextInt(480), rnd.nextInt(640), rnd.nextInt(480));
		}
		*/
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getButton() == e.BUTTON1) {
			
			x1 = e.getX();
			y1 = e.getY();
		}
		else if(e.getButton() == e.BUTTON3) {
			
			x2 = e.getX();
			y2 = e.getY();
		}
		
		repaint();
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	//*********************************************

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getKeyCode() == e.VK_BACK_SPACE && article.length() > 0) {
			
			article = article.substring(0, article.length()-1);
		}
		
		else {
			
			article += e.getKeyChar();
		}
		
		repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	
}

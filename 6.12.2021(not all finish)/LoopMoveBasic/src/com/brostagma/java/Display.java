package com.brostagma.java;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Calendar;
import java.util.Random;

import javax.swing.JFrame;

public class Display extends Canvas {

	private static final long serialVersionUID = 1L;
	private static int WIDTH = 640;
	private static int HEIGHT = 480;
	protected boolean check = true;
	protected int frameDefaultW, frameDefaultH;
	protected int i = 0;
	protected int fps;
	Ball[] maxBall = null;
	Ball ball = new Ball();
	Rect rect = new Rect();
	JFrame frame = new JFrame();
	
	
	protected void initDisplay() {
		
		setSize(new Dimension(WIDTH, HEIGHT));
		addKeyListener(new Controller());
		
		
		
		frame.add(this);
		frame.pack();
		frameDefaultW = frame.getWidth();
		frameDefaultH = frame.getHeight();
		System.out.println(frame.getWidth() + " " + frame.getHeight());
		frame.addKeyListener(new Controller());
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
		frame.setVisible(true);
		
		balls(5);
		move();
	}
	

	

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		
		createObject(Controller.getKey());
		ball.drawBall(g);
		rect.drawRect(g);
		for(int z = 0; z < maxBall.length; z++) {
			
			if(check == true) {
				maxBall[z].setX(new Random().nextInt(400));
				maxBall[z].setY(new Random().nextInt(400));
			}
			else {
				maxBall[z].moveBall();
			}
			maxBall[z].drawBall(this.getGraphics());
		}
		check = false;
		
		
		//g.fillOval(ball.getY(), ball.getY(), ball.getWidth(), ball.getHeight());
	}
	
	public void balls(int count) {
		maxBall = new Ball[count];
		for(int z = 0; z < count; z++) {
			maxBall[z] = new Ball();
		}
		
	}
	
	protected void createObject(char key) {
		if(key == 'q') {
			Ball ballKey = new Ball();
			ballKey.setX(getMousePosition().x);
			ballKey.setY(getMousePosition().y);
			ballKey.drawBall(this.getGraphics());
		}
		else if(key == 'w') {
			Rect rectKey = new Rect();
			rectKey.drawRect(this.getGraphics());
		}
		else if(key == 'e' && check == true) {
			
		}
			
			
	}
	
	private void move() {
		
		while(true) {
			new Thread("move");
			try {
				Thread.sleep(8);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			ball.moveBall();
			rect.moveRect();
			repaint();
			System.gc();
				
			if(frameDefaultW != frame.getWidth() || frameDefaultH != frame.getHeight()) {
				frameDefaultW = frame.getWidth();
				frameDefaultH = frame.getHeight();
				WIDTH = frameDefaultW;
				HEIGHT = frameDefaultH - (frame.getHeight() - frame.getContentPane().getHeight());
				setSize(new Dimension(WIDTH, HEIGHT));
			}
			
			if(fps == 60) {
				Calendar calendar = Calendar.getInstance();
				System.out.println("fps");
				System.out.println(calendar.get(Calendar.SECOND));
				fps = 0;
			}
			fps++;
		}
	}



	public static int getWIDTH() {
		return WIDTH;
	}
	
	public static int getHEIGHT() {
		return HEIGHT;
	}
	
}

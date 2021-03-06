package com.brostagma;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Board extends JPanel {

	public Board() {}
	
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		drawDonut(g);
	}

	private void drawDonut(Graphics g) {
		// TODO Auto-generated method stub
		
		Graphics2D g2d = (Graphics2D) g;
		
		RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
		
		g2d.setRenderingHints(rh);
		
		Dimension size = getSize();
		double w = size.getHeight();
		double h = size.getWidth();
		
		Ellipse2D e2d = new Ellipse2D.Double(0,0,100,150);
		g2d.setStroke(new BasicStroke(1));
		g2d.setColor(Color.gray);
		
		for(double deg = 0; deg < 360; deg += 5) {
			AffineTransform at = AffineTransform.getTranslateInstance(w/2,h/2);
			at.rotate(Math.toRadians(deg));
			g2d.draw(at.createTransformedShape(e2d));
		}
	}

	
}

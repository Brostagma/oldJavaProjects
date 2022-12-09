package com.brostagma;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class NPCObjects extends Objects {
	
	private int safeX = 100, safeY = 50;
	private int armorX = 250, armorY = 50;
	private int warX = 400, warY = 50;
	private Rectangle rectSafe;
	private Rectangle rectArmor;
	private Rectangle rectWar;
	private Rectangle rectTest;
	
	public NPCObjects() {
		rectSafe = new Rectangle(safeX, safeY,100,100);
		setObjectNo(0, 0);
		setObjectName("NPCSafe", 0);
		rectArmor = new Rectangle(armorX, armorY,100,100);
		setObjectNo(1, 1);
		setObjectName("NPCArmor", 1);
		rectWar = new Rectangle(warX, warY,100,100);
		setObjectNo(2, 2);
		setObjectName("NPCWar", 2);
//		rectTest = new Rectangle(320,280,230,230);
	}

	public void NPCSafe(Graphics g) {
		drawRect(Color.blue, g,rectSafe);
	}
	
	public void NPCArmor(Graphics g) {
		drawRect(Color.red, g,rectArmor);
		
	}
	
	public void NPCWar(Graphics g) {
		drawRect(Color.green, g,rectWar);
		
	}
	
	@Override
	public String getObjectName(int index) {
		// TODO Auto-generated method stub
		return super.getObjectName(index);
	}
	
//	public void NPCTest(Graphics g) {
//		drawRect(Color.pink, g,rectTest);
//		setObjectNo(4, 4);
//		setObjectName("NPCTest", 4);
//	}
//	
	
	public Rectangle getRectSafe() {
		return rectSafe;
	}

	public void setRectSafe(Rectangle rectSafe) {
		this.rectSafe = rectSafe;
	}

	public Rectangle getRectArmor() {
		return rectArmor;
	}

	public void setRectArmor(Rectangle rectArmor) {
		this.rectArmor = rectArmor;
	}

	public Rectangle getRectWar() {
		return rectWar;
	}

	public void setRectWar(Rectangle rectWar) {
		this.rectWar = rectWar;
	}
}

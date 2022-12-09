package com.brostagma;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public abstract class Objects {
	
	//	private boolean check;
	private int x;
	private int y;
	private int width;
	private int height;
	private int[] objectNo = new int[12];
	private String[] objectName = new String[12];
	private String interaction;
	private Color color;
	private Rectangle rect;
	private Rectangle[] ObjectArray;
	private Rectangle player;
	
	
	public void drawRect(Color color, Graphics g, Rectangle rect) {
		this.rect = new Rectangle(rect.x,rect.y,rect.width,rect.height);
		this.x = rect.x;
		this.y = rect.y;
		this.width = rect.width;
		this.height = rect.height;
		this.color = color;
		g.setColor(color);
		g.fillRect((int) this.rect.getX(), (int) this.rect.getY(), (int) this.rect.width, (int) this.rect.height);
	}

	public boolean checkCollision(Rectangle player, Rectangle[] ObjectArray) {
		this.ObjectArray = ObjectArray;
		this.player = new Rectangle();
		this.player = player;
		for(int a = 0; a < ObjectArray.length; a++) {
			if((this.player.x + (this.player.width -1)) >= this.ObjectArray[a].x && this.player.x <= (this.ObjectArray[a].x + (this.ObjectArray[a].width -1))) {
				if((this.player.y + (this.player.height -1)) >= this.ObjectArray[a].y && this.player.y <= (this.ObjectArray[a].y + (this.ObjectArray[a].height -1))) {
					interaction = new NPCObjects().getObjectName(a);
					return true;
				}
			}
		}
		
		return false;
	}
	
//	private void objectNameNo(int no, String name, boolean check) {
//		
//		if(check) {
//			int[] newObjectNo = new int[this.objectNo.length + 1];
//			String[] newObjectName = new String[this.objectName.length + 1];
//			for(int a = 0; a < this.objectNo.length; a++) {
//				newObjectNo[a] = this.objectNo[a];
//				newObjectName[a] = this.objectName[a];
//			}
//			boolean check2 = true;
//			this.objectNo = new int[newObjectNo.length];
//			this.objectName = new String[newObjectName.length];
//			if(check2) {
//				for(int a = 0; a < newObjectNo.length; a++) {
//					this.objectNo[a] = newObjectNo[a];
//					this.objectName[a] = newObjectName[a];
//					System.out.println(this.objectName[a]);
//				}
//				this.check = false;
//			}
//		}
//		else {
//			this.objectNo[0] = no;
//			this.objectName[0] = name;
//			this.check = true;
//		}
//	}

	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}


	public int getWidth() {
		return width;
	}


	public void setWidth(int width) {
		this.width = width;
	}


	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}


	public int getObjectNo(int index) {
		return objectNo[index];
	}

	public int[] getObjectNo() {
		return objectNo;
	}

	public void setObjectNo(int objectNo, int index) {
		this.objectNo[index] = objectNo;
	}


	public String getObjectName(int index) {
		return objectName[index];
	}
	
	public String[] getObjectName() {
		return objectName;
	}


	public void setObjectName(String objectName, int index) {
		this.objectName[index] = objectName;
	}


	public Color getColor() {
		return color;
	}


	public void setColor(Color color) {
		this.color = color;
	}
	
	public String getInteraction() {
		return interaction;
	}
}

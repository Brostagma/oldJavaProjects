package com.brostagma;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Player extends Objects{
	
	private int playerX = 230, playerY = 300;
	private Rectangle rectPlayer;
	private Rectangle checkColl;
	private Rectangle[] objectArray;
	
	public Player() {
		// TODO Auto-generated constructor stub
	}

	public void drawPlayer(Graphics g) {
		rectPlayer = new Rectangle(playerX, playerY,50,50);
		drawRect(Color.black, g, rectPlayer);
		setObjectNo(0, 0);
		setObjectName("NPCPlayer", 0);
	}
	
	private void initColl() {
		checkColl = new Rectangle(rectPlayer);
		objectArray = new Rectangle[3];
		objectArray[0] = new NPCObjects().getRectSafe();
		objectArray[1] = new NPCObjects().getRectArmor();
		objectArray[2] = new NPCObjects().getRectWar();
	}
	
	public void movePlayer(int x, int y) {
		initColl();
		checkColl.x += x;
		checkColl.y += y;
		

		if(checkCollision(checkColl, objectArray)) {
			if(getInteraction() == "NPCSafe") {
				System.out.println("güvendesin dostum !");
				
			}
			else if(getInteraction() == "NPCArmor") {
				System.out.println("armor alır mısın ?");
			}
			else if(getInteraction() == "NPCWar") {
				System.out.println("savaşa hazır mısın ?");
			}
		}
		else {
			this.playerX += x;
			this.playerY += y;
		}
	}
	
	public Rectangle getRectPlayer() {
		return rectPlayer;
	}

	public void setRectPlayer(Rectangle rectPlayer) {
		this.rectPlayer = rectPlayer;
	}
	
	public Rectangle getCheckColl() {
		return checkColl;
	}

	public void setCheckColl(Rectangle checkColl) {
		this.checkColl = checkColl;
	}
	
	public Rectangle[] getObjectArray() {
		return objectArray;
	}

	public void setObjectArray(Rectangle[] objectArray) {
		this.objectArray = objectArray;
	}
}

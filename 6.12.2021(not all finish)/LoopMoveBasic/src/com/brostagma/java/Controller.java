package com.brostagma.java;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Controller implements KeyListener {

	private static char key;
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Key Pressed");
		if(e.getKeyCode() == KeyEvent.VK_Q) {
			key = 'q';
		}
		else if(e.getKeyCode() == KeyEvent.VK_W) {
			key = 'w';
		}
		else if(e.getKeyCode() == KeyEvent.VK_E) {
			key = 'e';
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	public static char getKey() {
		return key;
	}
	
	public static void setKey(char key) {
		Controller.key = key;
	}

}

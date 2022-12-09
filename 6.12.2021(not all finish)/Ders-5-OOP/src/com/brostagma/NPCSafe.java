package com.brostagma;

import java.awt.event.KeyEvent;

public class NPCSafe extends NPCObjects{

	public NPCSafe() {
		
	}
	
	public void talk() {
		System.out.println("Konuştuk... Burası safe bölge");
	}
	
	public void talkKey(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_E) {
			if(getInteraction() == "NPCSafe") {
				talk();
			}
			
		}
	}
}

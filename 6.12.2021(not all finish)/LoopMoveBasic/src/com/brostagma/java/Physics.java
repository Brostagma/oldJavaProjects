package com.brostagma.java;

public class Physics {
	
	boolean check1 = true;
	
	public int checkWindowPhysics(int itemHeight, int itemY) {
		if(this.check1 == true) {
			if((itemY + itemHeight) > Display.getHEIGHT()) {
				check1 = false;
			}
			return +4;
		}
		else if(this.check1 == false) {
			if(itemY < 0) {
				check1 = true;
			}
			return -4;
		}
		
		return 0;
	}
}

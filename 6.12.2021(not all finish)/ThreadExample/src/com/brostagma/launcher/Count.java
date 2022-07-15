package com.brostagma.launcher;

public class Count {
	
	private static int count;
	
	public synchronized static void countPlus() {
		count++;
	}

	public static int getCount() {
		return count;
	}
	
}

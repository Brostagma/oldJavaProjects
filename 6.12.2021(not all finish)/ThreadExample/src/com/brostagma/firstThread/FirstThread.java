package com.brostagma.firstThread;

import com.brostagma.launcher.Count;

public class FirstThread extends Count implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 5000; i++) {
			Count.countPlus();
			
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

package com.brostagma.launcher;

import com.brostagma.firstThread.FirstThread;
import com.brostagma.secondThread.SecondThread;

public class Launcher {

	Thread first;
	Thread second;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Launcher launcher = new Launcher();
		
		launcher.first = new Thread(new FirstThread());
		launcher.second = new Thread(new SecondThread());
		
		long startTime = System.currentTimeMillis();
		
		launcher.first.start();
		launcher.second.start();
		
		try {
			launcher.first.join();
			launcher.second.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(Count.getCount());
		
		long endTime = System.currentTimeMillis();
		int cc = (int)(endTime - startTime);
		System.out.print("End : " + cc );

	}

}

package com.brostagma.java;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumer {

	Random random = new Random();
	
	BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);
	
	public void produce() {
		// TODO Auto-generated method stub
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				Integer value = random.nextInt(100);
				queue.put(value);
				System.out.println("Producer Put Value : " + value + " Size : " + queue.size());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void consume() {
		// TODO Auto-generated method stub
		while(true) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				Integer value = queue.take();
				System.out.println("Consumer Take Value : " + value + " Size : " + queue.size());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

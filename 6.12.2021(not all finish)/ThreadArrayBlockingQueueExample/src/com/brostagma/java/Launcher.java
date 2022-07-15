package com.brostagma.java;

public class Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProducerConsumer pc = new ProducerConsumer();
		
		Thread producer = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
				pc.produce();
			}
		});
		
		Thread consumer = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				pc.consume();
			}
		});
		
		producer.start();
		consumer.start();
		
		try {
			producer.join();
			consumer.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

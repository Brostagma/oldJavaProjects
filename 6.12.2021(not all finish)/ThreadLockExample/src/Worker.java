import java.util.ArrayList;
import java.util.Random;

public class Worker {

	Random random = new Random();
	ArrayList<Integer> list1 = new ArrayList<Integer>();
	ArrayList<Integer> list2 = new ArrayList<Integer>();
	String lock1 = "lock1";
	String lock2 = "lock2";
	
	public void list1Add() {
		
		synchronized (lock1) {
			
			try {
				Thread.sleep(1);
				
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			list1.add(random.nextInt());
		}
	}
	
	public void list2Add() {
		
		synchronized (lock2) {
			
			try {
				Thread.sleep(1);
				
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			list2.add(random.nextInt());
		}
	}
	
	public void work() {
		
		for(int i = 0; i < 1000; i++) {
			list1Add();
			list2Add();
		}
		
		
	}
	
	public void start() {
		
		
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				work();
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				work();
			}
		});
		long startTime = System.currentTimeMillis();
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long endTime = System.currentTimeMillis();
		
		System.out.println("List 1 : " + list1.size() + " " + "List 2 : " + list2.size());
		System.out.println("Finish : " + (endTime - startTime));
	}
}

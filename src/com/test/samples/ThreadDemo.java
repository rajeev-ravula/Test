package com.test.samples;

public class ThreadDemo implements Runnable{
	
	

	public static void main(String[] args) {
		Runnable td = new ThreadDemo();
		Thread t1 = new Thread(td);
		Thread t2 = new Thread(td);
		Thread t3 = new Thread(td);
		t1.start();
		try {
			t2.start();
			t2.join();
		} catch (Exception e) {
			System.out.println(e);
		}
		t3.start();
	}

	@Override
	public void run() {
		for(int i=0; i<5 ; i++) {
			try {
				Thread.sleep(500);
				System.out.println(Thread.currentThread());
			} catch (InterruptedException ie) {
				System.out.println(ie);
			}
		}
		
	}

}

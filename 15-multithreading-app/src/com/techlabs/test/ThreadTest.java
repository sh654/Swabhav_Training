package com.techlabs.test;

public class ThreadTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Thread thread = Thread.currentThread();
		System.out.println(thread);
		
		thread.setName("My Thread");
		System.out.println(thread);
		
		for(int i =0 ; i<5; i++) {
			System.out.println(Thread.currentThread().getName()+ ": "+i);
			Thread.sleep(1000);
		}
	}

}

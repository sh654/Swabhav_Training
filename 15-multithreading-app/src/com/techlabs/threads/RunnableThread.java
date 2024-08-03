package com.techlabs.threads;

public class RunnableThread implements Runnable{

	// Multiple facility over extending the thread
	private Thread thread;
	
	public RunnableThread() {
		thread = new Thread(this);
		thread.start();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i=5; i>0; i--) {
			System.out.println(Thread.currentThread().getName()+":"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	

}

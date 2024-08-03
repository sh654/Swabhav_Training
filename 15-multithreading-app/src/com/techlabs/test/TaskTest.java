package com.techlabs.test;

import com.techlabs.model.Task;

public class TaskTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0; i<10; i++) {
			Thread thread = new Thread(new Task());
			thread.start();
		}
	}

}

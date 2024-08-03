package com.techlabs.test;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.techlabs.model.Task;

public class ExecutorServiceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int coreCount = Runtime.getRuntime().availableProcessors();
		System.out.println("Available Processors: "+coreCount);
		
//		ExecutorService service = Executors.newFixedThreadPool(coreCount);
//		ExecutorService service = Executors.newCachedThreadPool(); 
		ExecutorService service = Executors.newSingleThreadExecutor();
		for(int i=1; i<1000; i++) {
			service.execute(new Task());
		}
		
	}

}

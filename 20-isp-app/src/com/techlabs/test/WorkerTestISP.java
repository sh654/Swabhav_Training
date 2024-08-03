package com.techlabs.test;

import com.techlabs.ispSolution.Labour;
import com.techlabs.ispSolution.Robot;
import com.techlabs.model.IWorker;

public class WorkerTestISP {

	public static void main(String args[]) {
		
		Labour loader = new Labour();
		loader.startWork();
		loader.startWork();
		loader.drink();
		loader.eat();
		
		Robot robo = new Robot();
		robo.startWork();
		robo.stopWork();
		System.out.println("No extra fucntion due to isp");
		
	}
}

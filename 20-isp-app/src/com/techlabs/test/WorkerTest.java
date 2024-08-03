package com.techlabs.test;

import com.techlabs.ispViolation.Labour;
import com.techlabs.ispViolation.Robot;
import com.techlabs.model.IWorker;

public class WorkerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IWorker labour = new Labour();
		labour.startWork();
		labour.stopWork();
		labour.drink();
		labour.eat();
		
		IWorker robo = new Robot();
		robo.startWork();
		robo.stopWork();
		System.out.println("But robo does not eat and sleep");
		robo.eat();
		robo.drink();
		
	}

}

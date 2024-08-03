package com.techlabs.ispViolation;

import com.techlabs.model.IWorker;

public class Robot implements IWorker{

	@Override
	public void startWork() {
		// TODO Auto-generated method stub
		System.out.println("Robot starts working");
	}

	@Override
	public void stopWork() {
		// TODO Auto-generated method stub
		System.out.println("Robot shut down");
	}

	// No need since robot dosent sleep
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Robot charges");
	}

	@Override
	public void drink() {
		// TODO Auto-generated method stub
		System.out.println("Robot takes oil");
	}

}

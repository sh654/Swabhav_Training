package com.techlabs.ispViolation;

import com.techlabs.model.IWorker;

public class Labour implements IWorker{

	@Override
	public void startWork() {
		// TODO Auto-generated method stub
		System.out.println("Labour Start Work");
	}

	@Override
	public void stopWork() {
		// TODO Auto-generated method stub
		System.out.println(" I go to sleep");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println(" Labour eats Lunch");
	}

	@Override
	public void drink() {
		// TODO Auto-generated method stub
		System.out.println("Labour drinks now");
	}

}

package com.techlabs.ispSolution;

public class Labour implements IWorker{

	@Override
	public void startWork() {
		// TODO Auto-generated method stub
		System.out.println("Start Work");
	}

	@Override
	public void stopWork() {
		// TODO Auto-generated method stub
		System.out.println("Labour Stop Work");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Labour eats Lunch");
	}

	@Override
	public void drink() {
		// TODO Auto-generated method stub
		System.out.println("Labour drinks");
	}

}

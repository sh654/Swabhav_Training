package com.techlabs.ispSolution;

import com.techlabs.model.IWorkable;

public class Robot implements IWorkable{

	@Override
	public void startWork() {
		// TODO Auto-generated method stub
		System.out.println("ON");
	}

	@Override
	public void stopWork() {
		// TODO Auto-generated method stub
		System.out.println("OFF");
	}
	
	
}

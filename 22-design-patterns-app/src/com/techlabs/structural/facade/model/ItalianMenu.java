package com.techlabs.structural.facade.model;

public class ItalianMenu implements IMenu{

	@Override
	public void displayMenu() {
		// TODO Auto-generated method stub
		System.out.println("Italian Menu");
	}
	
	public void getDisplayMenu() {
		displayMenu();
	}

}

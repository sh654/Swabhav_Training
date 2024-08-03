package com.techlabs.creational.AbstractFactory.model;

public class CurrentFactory implements Accountfactory{

	@Override
	public IAccount makeAccounts(String name, long accountNumber, double balance, double draftLimit) {
		// TODO Auto-generated method stub
		return new CurrentAccount(name, accountNumber, balance, draftLimit);
	}

}

package com.techlabs.creational.AbstractFactory.model;

public class SavingsFactory implements Accountfactory{

	@Override
	public IAccount makeAccounts(String name,long accountNumber, double balance, double minBalance) {
		// TODO Auto-generated method stub
		return new SavingsAccount(name, accountNumber, balance, minBalance);
	}

}

package com.techlabs.creational.AbstractFactory.model;

public interface Accountfactory {

	IAccount makeAccounts(String name, long accountNumber, double balance, double additional);

	
}

package com.techlabs.creational.AbstractFactory.model;

public interface IAccount {

	void debit(double amount);
	void credit(double amount);
	double getBalance();
}

package com.techlabs.creational.Factory.model;

public class AccountFactory {
	
	public static IAccount makeAccount(AccountTypes accounttype) {
		switch(accounttype) {
		case SAVINGSACCOUNT:
			return new SavingsAccount();
		case CURRENTACCOUNT:
			return new CurrentAccount();
		}
		return null;
		
	}
	
}

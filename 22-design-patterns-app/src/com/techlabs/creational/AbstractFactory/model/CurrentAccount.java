package com.techlabs.creational.AbstractFactory.model;

public class CurrentAccount implements IAccount{
	
	private String name;
	private long accountNumber;
	private double draftLimit;
	public double balance;
	

	public CurrentAccount(String name, long accountNumber, double draftLimit, double balance) {
		super();
		this.name = name;
		this.accountNumber = accountNumber;
		this.draftLimit = draftLimit;
		this.balance = balance;
	}

	@Override
	public void debit(double amount) {
		// TODO Auto-generated method stub
		if(amount<0)
			System.out.println("Insufficient funds including overdraft limit.");
		
		if (balance + draftLimit >= amount) {
            balance -= amount;
        } 
		
	}

	@Override
	public void credit(double amount) {
		// TODO Auto-generated method stub
		 if (amount > 0) {
	            balance += amount;
	        }
	        System.out.println("Current Account Balance after debiting :" +balance);
	}

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}

	@Override
	public String toString() {
		return "CurrentAccount [name=" + name + ", accountNumber=" + accountNumber + ", draftLimit=" + draftLimit
				+ ", balance=" + balance + "]";
	}
	
	
	
	
}

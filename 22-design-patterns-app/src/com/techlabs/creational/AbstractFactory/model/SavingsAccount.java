package com.techlabs.creational.AbstractFactory.model;

public class SavingsAccount implements IAccount{
	
	private String name;
	private long accountNumber;
	private double balance;
	private double minBalance;
	private double interestRate;
	
	
	public SavingsAccount(String name, long accountNumber, double balance, double minBalance) {
		super();
		this.name = name;
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.minBalance = minBalance;
		
	}

	@Override
	public void debit(double amount) {
		// TODO Auto-generated method stub
		 if (amount > 0 && amount <= balance) {
	            balance -= amount;
	        }
	        System.out.println("Savings Account Balance after debiting :" +balance);
		 
		
	}

	@Override
	public void credit(double amount) {
		// TODO Auto-generated method stub
		if (amount > 0) {
            balance += amount;
        }
        System.out.println("Savings Account Balance after crediting: " + balance);
		
	}

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}

	@Override
	public String toString() {
		return "SavingsAccount [name=" + name + ", accountNumber=" + accountNumber + ", balance=" + balance
				+ ", minBalance=" + minBalance + "]";
	}
	
	

}

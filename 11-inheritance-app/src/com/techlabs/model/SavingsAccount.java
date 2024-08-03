package com.techlabs.model;

public class SavingsAccount extends Account {
	

	public SavingsAccount(long accountNumber, String name, double balance, double MIN_BALANCE) {
		super(accountNumber, name, balance);
		// TODO Auto-generated constructor stub
		this.MIN_BALANCE = MIN_BALANCE;
	}

	private double MIN_BALANCE ;

	@Override
	public String toString() {
		return "SavingsAccount [MIN_BALANCE=" + MIN_BALANCE + ", Account Number()=" + getAccountNumber()
				+ ", Name()=" + getName() + ", Balance()=" + getBalance() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}

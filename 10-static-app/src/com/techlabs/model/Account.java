package com.techlabs.model;

public class Account {

	private int accountNumber;
	private String accountName;
	private int accountBalance;
	
	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public int getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}

	public Account(int accountNumber, String accountName, int accountBalance) {
		super();
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.accountBalance = accountBalance;
		count++;
	}
	
	public void display() {
		System.out.println("Account Number: "+ accountNumber);
		System.out.println("Account Name: "+ accountName);
		System.out.println("Account Balance: "+ accountBalance);
		System.out.println("Account Number: "+ accountNumber);
	}
	private static int count = 0;
	
	public static int getCount() {
		return count;
	}
}

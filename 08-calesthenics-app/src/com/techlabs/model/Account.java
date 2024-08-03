package com.techlabs.model;

import java.util.Random;

public class Account {
	
	private long accountNumber;
	private String accountName;
	private double accountBalance;
	private AccounType accounttype;
	
	
	public Account(long accountNumber, String accountName, double accountBalance, AccounType accounttype) {
//		super();
		this.accountNumber = this.randomAccountNumber();
		this.accountName = accountName;
		this.accountBalance = accountBalance;
		this.accounttype = accounttype;
	}
	
	
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public AccounType getAccounttype() {
		return accounttype;
	}
	public void setAccounttype(AccounType accounttype) {
		this.accounttype = accounttype;
	}
	
	
	public static long randomAccountNumber() {
		long accountNumberCopy = 0;
		Random random = new Random();
		for(int i=0; i<10 ;i++) {
			accountNumberCopy += random.nextInt(10);
			if(i!=9) accountNumberCopy *= 10;
		}
		
		return accountNumberCopy;
		
	}
	
	public void credit(double amount) {
		if(amount<0) {
			System.out.println("Enter valid amount");
			return;
		} else {
			accountBalance += amount;
			System.out.println("Your account credited with : " +amount+" Updated amount is : "+accountBalance);
		}
	}
	
	public void debit(double amount) {
		if(amount<0 && amount>accountBalance) {
			System.out.println("");
			return;
		} else {
			accountBalance -= amount;
			System.out.println("Your amount debit with: "+amount+" Updated Balance is : "+accountBalance);
		}
	}


	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", accountName=" + accountName + ", accountBalance="
				+ accountBalance + ", accounttype=" + accounttype + "]";
	}
	
	
	
}

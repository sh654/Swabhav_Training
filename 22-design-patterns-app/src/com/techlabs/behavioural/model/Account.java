package com.techlabs.behavioural.model;

import java.util.ArrayList;
import java.util.List;

import com.techlabs.behavioural.model.InsufficientFundsException;

public class Account {

	private String accountName;
	private long accountNumber;
	private double balance;
	
	List<INotifier> notifiers;

	public Account(String accountName, long accountNumber, double balance) {
		super();
		this.accountName = accountName;
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.notifiers = new ArrayList<>();
	}
	

	public void debit(double amount) {
		if(amount <0)
			System.out.println("Invalid Amount");
		
		if(amount > balance)
			throw new InsufficientFundsException(this.getBalance());
		
		balance -= amount;
		System.out.println("Updated Balance : "+balance + " Debited by: "+amount);
		notifyAllNotifiers();
	}

	public void credit(double amount) {
		if(amount< 0)
			System.out.println("Enter Valif Amount");
		
		balance += amount;
		System.out.println("Updated Balance : "+balance+ " Debited by: "+amount);
		notifyAllNotifiers();
	}
	
	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public List<INotifier> getAccounts() {
		return notifiers;
	}
	
	public void addNotifier(INotifier notifier) {
        this.notifiers.add(notifier);
    }


	 public void registerNotifier(INotifier notifier) {
	        this.notifiers.add(notifier);
	    }

	    private void notifyAllNotifiers() {
	        for (INotifier notifier : notifiers) {
	            notifier.notify(this);
	        }
	    }
	
	
	
}

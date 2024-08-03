package com.techlabs.model;

public class CurrentAccount extends Account{
	private int OVER_DRAFT_LIMIT;


	@Override
	public String toString() {
		return "CurrentAccount [OVER_DRAFT_LIMIT=" + OVER_DRAFT_LIMIT + ", Account Number =" + getAccountNumber()
				+ ", Name=" + getName() + ", Balance =" + getBalance() + ", Class()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}


	public CurrentAccount(long accountNumber, String name, double balance, int oVER_DRAFT_LIMIT) {
		
		super(accountNumber, name, balance);
		OVER_DRAFT_LIMIT = oVER_DRAFT_LIMIT;
	}

	
	
}

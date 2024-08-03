package com.techlabs.model;

public class BankTransferPayments extends Payment{

	@Override
	public void processpayment() {
		// TODO Auto-generated method stub
		System.out.println("Accesing BankTransfer Payments");
	}

	@Override
	public void refund() {
		// TODO Auto-generated method stub
		System.out.println("Accesing Refund after Bank Transfer Payments");
	}
	
	
}

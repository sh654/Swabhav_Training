package com.techlabs.model;

public class CreditCardPayment extends Payment {

	@Override
	public void processpayment() {
		// TODO Auto-generated method stub
		System.out.println("Accessing CreditCard Payments");
	}

	@Override
	public void refund() {
		// TODO Auto-generated method stub
		System.out.println("Accessing Refund through Credit card");
	}

}

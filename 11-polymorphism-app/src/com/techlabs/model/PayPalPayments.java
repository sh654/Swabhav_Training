package com.techlabs.model;

public class PayPalPayments extends Payment{

	@Override
	public void processpayment() {
		// TODO Auto-generated method stub
		System.out.println("Accessing PayPalPayments");
	}

	@Override
	public void refund() {
		// TODO Auto-generated method stub
		System.out.println("Accesing Refund through PayPalPayments");
	}

}

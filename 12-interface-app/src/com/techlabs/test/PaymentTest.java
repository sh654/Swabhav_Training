package com.techlabs.test;

import com.techlabs.model.CreditCardPayments;
import com.techlabs.model.PayPalPayments;
import com.techlabs.model.Payments;

public class PaymentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Payments pay = new PayPalPayments();
		pay.processPayment();
		pay.refund();
		
		pay = new CreditCardPayments();
		pay.processPayment();
		pay.refund();
	}

}

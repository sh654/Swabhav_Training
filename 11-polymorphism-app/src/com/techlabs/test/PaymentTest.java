package com.techlabs.test;

import com.techlabs.model.BankTransferPayments;
import com.techlabs.model.CreditCardPayment;
import com.techlabs.model.PayPalPayments;
import com.techlabs.model.Payment;

public class PaymentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Payment pal = new PayPalPayments();
		pal.processpayment();
		pal.refund();
		

		Payment bank = new BankTransferPayments();
		bank.processpayment();
		bank.refund();
		
		Payment card = new CreditCardPayment();
		card.processpayment();
		card.refund();
		
	}

}

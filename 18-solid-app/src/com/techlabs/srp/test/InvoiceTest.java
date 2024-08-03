package com.techlabs.srp.test;

import com.techlabs.srp.model.Invoice;
import com.techlabs.srp.model.InvoicePrinter;
import com.techlabs.srp.model.TaxCalculator;

public class InvoiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Invoice invoice = new Invoice("12012", "health care", 12000, 15);
		
		TaxCalculator tax = new TaxCalculator(invoice);
		
		InvoicePrinter print = new InvoicePrinter(invoice, tax);
		
		tax.calculateTax();
		print.printDetails();
		
		
	}

}

package com.techlabs.srp.model;

public class InvoicePrinter {
	
	private Invoice invoice;
	private TaxCalculator taxCalci;
	public InvoicePrinter(Invoice invoice, TaxCalculator taxCalci) {
		super();
		this.invoice = invoice;
		this.taxCalci = taxCalci;
	}
	
	 public void printDetails() {
	        System.out.println("Invoice ID: " + invoice.getId());
	        System.out.println("Description: " + invoice.getDescription());
	        System.out.println("Amount: $" + invoice.getAmount());
	        System.out.println("Tax: $" + taxCalci.calculateTax());
	        System.out.println("Total Amount (including tax): $" + invoice.getAmount() + taxCalci.calculateTax());
	    }
}

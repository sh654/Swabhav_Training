package com.techlabs.test;

import model.techlabs.dip.violation.DBLogger;
import model.techlabs.dip.violation.TaxCalculator;

public class TaxCalculatorTest {
	 public static void main(String[] args) {  
	DBLogger dblogger = new DBLogger();
	TaxCalculator t1 = new TaxCalculator(dblogger);  
	t1.calculateTax(100, 10);
	TaxCalculator t2 = new TaxCalculator(dblogger);
	 t2.calculateTax(2000, 0); }
	}

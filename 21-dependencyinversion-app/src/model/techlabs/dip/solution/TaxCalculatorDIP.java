package model.techlabs.dip.solution;

import model.techlabs.dip.violation.DBLogger;

public class TaxCalculatorDIP {
		
		private DBLogger dblogger;
		
	public int calculateTax(int amount, int rate) {  
		int tax =0;
		try {   
			tax = amount/rate;
			System.out.println("Tax is : " + tax);  } 
		catch (Exception e) {
			dblogger.log(e.getMessage());  
			}
			return tax; 
			}
		
	}



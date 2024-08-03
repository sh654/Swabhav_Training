package com.techlabs.selection.test;

import java.util.*;
public class BillCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter value for number of Units Consumed : ");
		
		double units_consumed = scanner.nextDouble();
		
		double charge =75;
		
		double meter_charge;
		
		double total_water_bill;
				
		if(units_consumed <= 100) {
			
			meter_charge = units_consumed * 5;
			
			 total_water_bill = meter_charge + charge;
			 System.out.println("Water Bill: " +total_water_bill);
		} else {
			if(units_consumed <= 250) {
				meter_charge = charge+100*5;
				/* Above statement is valid for condition if we chose to append tax
				by above condition plus exceding above condition
				*/
				meter_charge = (units_consumed-100) * 10 ;
				total_water_bill = meter_charge + charge;
				
				System.out.println("Water Bill : " +total_water_bill);
				
			} else {
				
				
				meter_charge = units_consumed * 20;
				total_water_bill = meter_charge + charge;
				System.out.println("Water Bill: " +total_water_bill);
			}
		}
		
	}

}

package com.techlabs.decorator.test;

import com.techlabs.decorator.model.CarInspection;
import com.techlabs.decorator.model.ICarService;
import com.techlabs.decorator.model.OilChange;

public class ICarServiceTest {

	public static void main(String args[]) {
		
		ICarService basic = new CarInspection();
		System.out.println("Cost of Car Inspection : " +basic.getCost());
		
		ICarService oilChange = new OilChange(basic);
		System.out.println(oilChange.getCost());
		
		
	}
}

package com.techlabs.model;

import com.techlabs.test.Car;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car cardata = new Car(null, 0, 0);
		System.out.println(cardata);
		
		Car cardata2 = new Car("mercedes cla", 23.2, 7899987);
		System.out.println(cardata2);
		
	}

}

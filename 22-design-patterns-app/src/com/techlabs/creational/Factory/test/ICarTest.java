package com.techlabs.creational.Factory.test;

import com.techlabs.creational.Factory.model.CarFactory;
import com.techlabs.creational.Factory.model.CarTypes;
import com.techlabs.creational.Factory.model.ICar;
import com.techlabs.creational.Factory.model.Mahindra;
import com.techlabs.creational.Factory.model.Maruti;
import com.techlabs.creational.Factory.model.Tata;

public class ICarTest {

	public static void main(String[] args) {
		ICar car;
		 car= CarFactory.makeCar(CarTypes.Maruti);
		car.start();
		car.stop();
		
		car = CarFactory.makeCar(CarTypes.Tata);
		car.start();
		car.stop();
		
		car = CarFactory.makeCar(CarTypes.Mahindra);
		car.start();
		car.stop();
		
		
		/*
		 * Factory Design helps to create multiple objects not only by us
		 * Ie someone else give object on my demand
		 * 
		 * */
	}
}

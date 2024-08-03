package com.techlabs.creational.Factory.model;

public class CarFactory {

	public static ICar makeCar(CarTypes carName) {
		
		switch(carName) {
		case Maruti: 
			return new Maruti();
			
		case Tata:
			return new Tata();
		
		case Mahindra:
			return new Mahindra();
		
		
		}
		return null;
		
		
	}
	
}

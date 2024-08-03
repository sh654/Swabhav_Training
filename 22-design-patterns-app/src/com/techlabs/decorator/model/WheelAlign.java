package com.techlabs.decorator.model;

public class WheelAlign extends CarServiceDecorator{

	public WheelAlign(ICarService carObject) {
		super(carObject);
	}
	
	public double getCost() {
		return 500+super.getCost();
	}
	
}

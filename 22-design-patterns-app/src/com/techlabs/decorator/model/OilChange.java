package com.techlabs.decorator.model;

public class OilChange extends CarServiceDecorator{

	public OilChange(ICarService carObject) {
		super(carObject);
	}
	
	public double getCost() {
		return 500+super.getCost();
	}
	
}

package com.techlabs.decorator.model;

public class CarServiceDecorator implements ICarService{

	ICarService carObject;
	
	public CarServiceDecorator(ICarService carObject) {
		super();
//		carObject = new ICarService();
		this.carObject = carObject;
	}
	
	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		
		return carObject.getCost();
	}

	
}

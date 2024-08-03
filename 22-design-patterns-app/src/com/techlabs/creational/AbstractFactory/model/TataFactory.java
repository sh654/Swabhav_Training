package com.techlabs.creational.AbstractFactory.model;

public class TataFactory implements ICarFactory{

	@Override
	public ICars makeCar() {
		// TODO Auto-generated method stub
		return new Tata();
	}

}

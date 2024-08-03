package com.techlabs.test;

public class FourWheeler extends Vehicle {

	private double mileage;
	public FourWheeler(String companyName, double mileage) {
		super(companyName);
		// TODO Auto-generated constructor stub
		this.mileage = mileage;
	}
	public double getMileage() {
		return mileage;
	}
	public void setMileage(double mileage) {
		this.mileage = mileage;
	}

}

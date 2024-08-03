package com.techlabs.test;

public class Car extends FourWheeler{
	private int price;
	public Car(String companyName, double mileage, int price) {
		super(companyName, mileage);
		// TODO Auto-generated constructor stub
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car Price=" + price + ", Company Name" + getCompanyName() + ", Car Mielage: "+getMileage() +", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}

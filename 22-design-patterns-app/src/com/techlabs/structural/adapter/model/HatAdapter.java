package com.techlabs.structural.adapter.model;

public class HatAdapter implements IItem{

	private Hat hat;
	
	public HatAdapter(Hat hat) {
		// TODO Auto-generated constructor stub
		this.hat = hat;
	}

	@Override
	public String getItemName() {
		// TODO Auto-generated method stub
		return hat.getLongName()+hat.getShortname();
	}

	@Override
	public double getItemPrice() {
		// TODO Auto-generated method stub
		return hat.getBaseprice()+hat.getTax();
	}
	
	
	
}

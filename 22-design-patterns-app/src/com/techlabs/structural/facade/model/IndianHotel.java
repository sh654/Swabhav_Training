package com.techlabs.structural.facade.model;

public class IndianHotel implements IHotel{

	@Override
	public IMenu getMenu() {
		return new IndianMenu();
		// TODO Auto-generated method stub
		
	}

}

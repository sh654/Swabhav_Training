package com.techlabs.structural.facade.model;

public class HotelReception {
	
	
	public void getIndianMenu() {
		
		IHotel indHotel = new IndianHotel();
		IMenu menu = indHotel.getMenu();
		menu.displayMenu();
		
	}
	
	public void getItalianMenu() {
		
		IHotel italianHotel = new ItalianHotel();
		IMenu menu = italianHotel.getMenu();
		menu.displayMenu();
	}

	@Override
	public String toString() {
		return "HotelReception [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
}

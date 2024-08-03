package com.techlabs.structural.adapter.model;

public class Biscuit implements IItem{

	private String name;
    private double price;

    public Biscuit(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getItemName() {
        return name;
    }

    

	@Override
	public double getItemPrice() {
		// TODO Auto-generated method stub
		return price;
	}

}

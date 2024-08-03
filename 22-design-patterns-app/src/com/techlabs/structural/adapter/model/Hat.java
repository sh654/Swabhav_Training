package com.techlabs.structural.adapter.model;

public class Hat {

	private String shortname;
	private String longName;
	private double baseprice;
	private double tax;
	
	public Hat(String shortname, String longName, double baseprice, double tax) {
		super();
		this.shortname = shortname;
		this.longName = longName;
		this.baseprice = baseprice;
		this.tax = tax;
	}

	public String getShortname() {
		return shortname;
	}

	public void setShortname(String shortname) {
		this.shortname = shortname;
	}

	public String getLongName() {
		return longName;
	}

	public void setLongName(String longName) {
		this.longName = longName;
	}

	public double getBaseprice() {
		return baseprice;
	}

	public void setBaseprice(double baseprice) {
		this.baseprice = baseprice;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}
	
	
	
	
}

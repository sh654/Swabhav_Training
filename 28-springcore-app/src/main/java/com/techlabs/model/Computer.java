package com.techlabs.model;

public class Computer {

	private String name;
	private Harddisk hardDisk;
	public Computer(String name, Harddisk hardDisk) {
		super();
		this.name = name;
		this.hardDisk = hardDisk;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Harddisk getHardDisk() {
		return hardDisk;
	}
	@Override
	public String toString() {
		return "Computer [name=" + name + ", hardDisk=" + hardDisk + "]";
	}
	public void setHardDisk(Harddisk hardDisk) {
		this.hardDisk = hardDisk;
	}
	
	
	
}

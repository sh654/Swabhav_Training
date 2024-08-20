package com.techlabs.model;

public class Computer {

	private String name;
	private Harddisk disk;
	
	public Computer(String name, Harddisk disk) {
		super();
		this.name = name;
		this.disk = disk;
	}
	
	public Computer() {
		System.out.println("this is computer");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Harddisk getDisk() {
		return disk;
	}

	public void setDisk(Harddisk disk) {
		this.disk = disk;
	}

	@Override
	public String toString() {
		return "Computer [name=" + name + "]";
	}
	
	
	
}

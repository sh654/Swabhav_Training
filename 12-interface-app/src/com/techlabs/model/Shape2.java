package com.techlabs.model;

public interface Shape2 {
	
	void area();
	default void volumne() {
		System.out.println("Volume");
	}
}

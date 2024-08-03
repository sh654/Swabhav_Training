package com.techlabs.creational.AbstractFactory.test;

import com.techlabs.creational.AbstractFactory.model.ICarFactory;
import com.techlabs.creational.AbstractFactory.model.ICars;
import com.techlabs.creational.AbstractFactory.model.MarutiFactory;

public class ICarsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ICarFactory marutiFactory = new MarutiFactory();
		
		ICars maruti = marutiFactory.makeCar();
		maruti.start();
		maruti.stop();
	}

}

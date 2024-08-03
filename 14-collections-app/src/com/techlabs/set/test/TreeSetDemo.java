package com.techlabs.set.test;


import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<String> set = new TreeSet<String>();
		
		set.add("Kaivalya");
		set.add("Mrunalini");
		set.add("Shivam");
		set.add("Chirag");
		set.add("Chirag");
		
		System.out.println(set); // Duplication not allowed and order is ascending
	}

}

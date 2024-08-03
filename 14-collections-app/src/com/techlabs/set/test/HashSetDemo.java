package com.techlabs.set.test;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String args[]) {
		
		HashSet<String> set = new HashSet<String>();
		
		set.add("Kaivalya");
		set.add("Mrunalini");
		set.add("Shivam");
		set.add("Chirag");
		set.add("Chirag");
		
		System.out.println(set); // Duplication not allowed
	}
}

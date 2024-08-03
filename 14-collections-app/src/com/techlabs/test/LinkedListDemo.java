package com.techlabs.test;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> list = new LinkedList<String>();
		list.add("Vinayak");
		list.add("Devansh");
		list.addFirst("Shivam");
		list.addLast("Agaya");
		
		for(String name: list) {
			System.out.println(name);
			
		}
		
		System.out.println("Last Element: "+list.getFirst());
		System.out.println("Get Last: "+list.getLast());
	}

}

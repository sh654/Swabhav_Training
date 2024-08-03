package com.techlab.stringbuilder.test;

public class StringBuilder1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder str = new StringBuilder("Toby");
		System.out.println(str);
		
		//char at index 0
		System.out.println(str.charAt(0));
		
		//replace char 
		str.setCharAt(0, 'p');
		System.out.println(str);
		
		str.insert(0, 's');
		System.out.println(str);
		
		str.delete(2,3); 
		System.out.println(str);
		
		str.append("e");
		System.out.println(str); 
	}

}

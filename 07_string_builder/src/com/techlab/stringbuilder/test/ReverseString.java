package com.techlab.stringbuilder.test;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder str = new StringBuilder("hello");
		
		for(int i=0; i<str.length()/2 ; i++) {
			int front =i;
			int back = str.length()-1-i; // 5-1-0 ie at 4 index
			
			char frontChar = str.charAt(front);
			char backChar = str.charAt(back);
			
			str.setCharAt(front, backChar);
			str.setCharAt(back, frontChar);
		}
		System.out.println(str);
	}
	
}

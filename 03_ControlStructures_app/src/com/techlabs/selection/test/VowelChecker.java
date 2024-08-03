package com.techlabs.selection.test;

import java.util.*;
public class VowelChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Character: ");
		
		char ch = scanner.next().charAt(0);
		
		switch(ch) {
		case 'a' : 
		case 'e' :  
		case 'i' : 
		case 'o' :  
		case 'u' : System.out.println("It is a Vowel"); 
				   break; 
		default : System.out.println("Not a vowel");
		}
		
	}

}

package com.techlabs.selection.test;

import java.util.*;
public class SeasonEvaluator {
public static void main(String args[]) {
	
	Scanner scanner = new Scanner(System.in);
	
	int month = scanner.nextInt();
	
switch(month){
case 12:
case 11:
case 10:
case 1:
	System.out.println("Winter");
	break;
	
case 2:
case 3:
case 4:
case 5:
	System.out.println("Summer");
	break;
	
case 6:
case 7:
case 8:
case 9:
	System.out.println("Rainy");
	break;
	
	default: 
		System.out.println("Enter valid Season");
}
}
}

package com.techlabs.iterative.test;

public class Palindrome {
public static void main(String args[]) {
	
	 int remainder,sum=0,temp;    
	  int number=454;  
	  
	  temp=number;    
	  while(number>0){ 
		  
	   remainder =number%10;   
	   sum=(sum*10)+remainder;    // type of concatination
	   number=number/10;    
	  }    
	  if(temp==sum)    
	   System.out.println("palindrome number ");    
	  else    
	   System.out.println("not palindrome");    
	} 
	
}


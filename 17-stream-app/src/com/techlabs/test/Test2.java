package com.techlabs.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors; 
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numbers = Arrays.asList(10,20,30,40,50,55,53,45,77);
		
		System.out.println("Numbers in list are: ");
		numbers.stream().forEach((number)-> System.out.println(number));
		
//		System.out.println("Odd number in List: ");
//		numbers.stream()
//		.filter((number) -> (number%2 !=0))
//		.forEach((number) -> System.out.println(number));
		
		 System.out.println("Odd Number"); 
		  numbers.stream() 
		  .filter((number) -> (number%2 != 0)) 
		  .forEach((number)-> System.out.println("Number : " + number)); 
		  
		  List<Integer> sortedList =  
				    numbers.stream() 
				    .filter((number) -> (number%2 != 0)) 
				    .filter((number) -> (number > 20)) 
				    .collect(Collectors.toList()); 
				   
				  sortedList.stream().forEach((number)-> System.out.println("Number : " + number)); 
	}

}

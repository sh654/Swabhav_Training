package com.techlabs.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector; 
import java.util.stream.Collectors; 
 
public class Test { 
 public static void main(String[] args) { 
  List<Integer> numbers = Arrays.asList(1,2,4,5,6,7,8,3,5,66,77,2,21); 
   
  System.out.println("All Number"); 
  numbers.stream() 
    .forEach((number)-> System.out.println("Number : " + number)); 
   
  System.out.println("Odd Number"); 
  numbers.stream() 
  .filter((number) -> (number%2 != 0)) 
  .forEach((number)-> System.out.println("Number : " + number)); 
   
  System.out.println("Odd Number greater than 20"); 
  numbers.stream() 
  .filter((number) -> (number%2 != 0)) 
  .filter((number) -> (number > 20)) 
  .forEach((number)-> System.out.println("Number : " + number)); 
   
  List<Integer> sortedList =  
    numbers.stream() 
    .filter((number) -> (number%2 != 0)) 
    .filter((number) -> (number > 20)) 
    .collect(Collectors.toList()); 
   
  sortedList.stream().forEach((number)-> System.out.println("Number : " + number)); 
   
   
  System.out.println("Squared List"); 
  List<Integer> squareList = numbers.stream() 
  .map((number) -> number*number) 
  .collect(Collectors.toList()); 
   
  squareList.stream().forEach(  
    (number)-> System.out.println("Number : " + number) 
  ); 
  
  int sum = numbers.stream().reduce(0, (number1,number2) -> number1+number2);
  System.out.println("Sum : "+sum);
  
  System.out.println("Sorted List: ");
  List<Integer> sortedNumbers = numbers.stream()
		  .sorted()
		  .collect(Collectors.toList());
  
  sortedNumbers.stream()
  .forEach((number) -> System.out.println(number));
  
  System.out.println("Reverse List: ");
  List<Integer> reverseNumbers = numbers.stream().
 sorted(Comparator.reverseOrder()).collect(Collectors.toList());
  
  System.out.println(reverseNumbers);
  
  System.out.println("Top 3 Reverse List: ");
  List<Integer> top3 = numbers.stream().
		  sorted(Comparator.reverseOrder()).
		  limit(3).
		  collect(Collectors.toList());
  
  System.out.println(top3);
  
  Optional<Integer> max = numbers.stream().max((number1, number2)-> number1-number2);
  if(max.isPresent())
	  System.out.println("Max: " + max.get());
  
  Optional<Integer> min = numbers.stream().min((number1, number2) -> number1- number2);
  if(min.isPresent())
	  System.out.println("Min: " +min.get());
  
 } 
}

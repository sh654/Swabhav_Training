package com.techlabs.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names = Arrays.asList("Jayesh", "Nimesh", "Merk", "Mahesh", "Ramesh", "Ram", "Vinay", "Jay");
		
		List<String> sortedName = names.stream().sorted().limit(3).collect(Collectors.toList());
		System.out.println(sortedName);
		
		List<String> firstThreeWithA = names.stream()
                .filter(name -> name.toLowerCase().contains("a"))
                .sorted()
                .limit(3)
                .collect(Collectors.toList());

System.out.println("First 3 students with 'a' sorted in ascending order: " + firstThreeWithA);
		
		List<String> desc = names.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(desc);
		
		List<String> firstThreeChars = names.stream()
                .map(name -> name.length() >= 3 ? name.substring(0, 3) : name)
                .collect(Collectors.toList());
		
		System.out.println(firstThreeChars);
		
		List<String> nameLessThanFour = names.stream()
				.filter(name-> name.length() <=4)
				.collect(Collectors.toList());
		
		System.out.println(nameLessThanFour);
	}

}

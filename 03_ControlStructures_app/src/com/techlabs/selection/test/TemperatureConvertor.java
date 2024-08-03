package com.techlabs.selection.test;

import java.util.Scanner;

public class TemperatureConvertor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter temperature: ");
        double temperature = scanner.nextDouble();
        
        System.out.println("Choose conversion:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Celsius to Kelvin");
        System.out.println("4. Kelvin to Celsius");
        System.out.println("5. Fahrenheit to Kelvin");
        System.out.println("6. Kelvin to Fahrenheit");
        
        
        int choice = scanner.nextInt();
        
        switch(choice) {
        case 1:
        	temperature = (temperature*1.8)+ 32;
        	System.out.println("Your Temperature Celsius to Fahrenheit is : " +temperature);
        	break;
        case 2:
        	temperature = (temperature - 32) * 5 / 9;
        	System.out.println("Your Temperature Fahrenheit to Celsius : " +temperature);
        	break;
        case 3:
        	temperature = temperature + 273.15;
        	System.out.println("Your Temperature Celsius to Kelvin is : " +temperature);
        	break;
        case 4:
        	temperature = temperature - 273.15;
        	System.out.println("Your Temperature Kelvin to Celsius is : " +temperature);
        	break;
        case 5:
        	temperature = 273.5 + ((temperature - 32.0) * (5.0/9.0));
        	System.out.println("Your Temperature Fahrenheit to Kelvin is : " +temperature);
        	break;
        case 6:
        	temperature = (temperature - 273.15) * 9 / 5 + 32;
        	System.out.println("Your Temperature Kelvin to Fahrenheit is : " +temperature);
        	break;
        default:
        	System.out.println("Please provide valid choice ");
        }
	}

}

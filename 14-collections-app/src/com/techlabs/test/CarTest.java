package com.techlabs.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.techlabs.model.Car;

public class CarTest {
	
public static void main(String args[]) {
	
	Scanner scanner = new Scanner(System.in);
	
	List<Car> car = new ArrayList<Car>();
	readCarsDetails(car, scanner);
	
	double max = maxMileAge(car);
	System.out.println(max);
}
private static void readCarsDetails(List<Car> car, Scanner scanner) {
	for(int i =0; i<3; i++) {
		System.out.println("Enter Car Id: ");
		int carId = scanner.nextInt();
		System.out.println("Enter Car Company Name: ");
		String carName = scanner.next();
		System.out.println("Enter Car Price: ");
		double price = scanner.nextDouble();
		System.out.println("Enter Car Mieleage: ");
		double mileage= scanner.nextDouble();
		
		car.add(new Car(carId, carName, price, mileage));
		
	}
}
//
//private static void display(List<Car> car, Scanner scanner) {
//	for(int i=0; i<)
//}

private static double maxMileAge(List<Car> car) {
//	double maxMileAge = Double.MIN_VALUE;
double maxMileAge =0;
    for (Car cars : car) {
        if (cars.getMileage() > maxMileAge) {
            maxMileAge = cars.getMileage();
        }
    }
	return maxMileAge;
}
}

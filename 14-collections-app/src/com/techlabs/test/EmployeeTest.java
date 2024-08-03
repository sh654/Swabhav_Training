package com.techlabs.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.techlabs.model.Employee;
import com.techlabs.model.EmloyeeComperator;
import com.techlabs.model.Student;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        List<Employee> employee = new ArrayList<Employee>();

        readStudents(employee, scanner);
        System.out.println("Employee Sorted Id: ");
        compareId(employee);
        printEmployee(employee);
        
        System.out.println("Employee Sorted Name: ");
        
        CompareName(employee);
        printEmployee(employee);
	}
	
	
	 private static void printEmployee(List<Employee> employee) {
		// TODO Auto-generated method stub
		for(Employee employe : employee) {
			System.out.println(employee);
		}
	}


	private static void readStudents(List<Employee> employee, Scanner scanner) {
			System.out.println("Enterno of emp: ");
			int empNo = scanner.nextInt();
	        for (int i = 0; i < empNo; i++) {
	            System.out.print("\nEnter roll no: ");
	            int employeeId = scanner.nextInt();

	            System.out.print("Enter Name: ");
	            String employeeName = scanner.next();
	            
	            System.out.print("Enter marks: ");
	            int employeeSalary = scanner.nextInt();

	            employee.add(new Employee(employeeId, employeeName, employeeSalary));
	        }
	    }
	 
	 private static void compareId(List<Employee> employee) {
		 
		 employee.sort(new EmloyeeComperator.employeeId());;
	 }
	 
	 private static void CompareName(List<Employee> employee) {
		 employee.sort(new EmloyeeComperator.employeeName());
	 }
	 
	 private static void sortSal(List<Employee> employee) {
		 employee.sort(new EmloyeeComperator.employeeSalary());
	 }
	 
	 // then comparing just require one method and then compare b order of require
}

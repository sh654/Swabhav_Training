package com.techlabs.model;

import java.util.Comparator;

public class EmloyeeComperator {

	public static class employeeId implements Comparator<Employee> {
	

		public int compare(Employee o1, Employee o2) {
			// TODO Auto-generated method stub
			if(o1.getEmployeeId() > o2.getEmployeeId())
				return 1;
			if(o1.getEmployeeId() < o2.getEmployeeId())
				return -1;
			return 0;
		}
		
	}

	public static class employeeName implements Comparator<Employee>{

		@Override
		public int compare(Employee o1, Employee o2) {
			// TODO Auto-generated method stub
			return o1.getEmployeeName().compareTo(o2.getEmployeeName());
		}
		
	}
	
	public static class employeeSalary implements Comparator<Employee>{

		@Override
		public int compare(Employee o1, Employee o2) {
			// TODO Auto-generated method stub
			return (int) (o1.getEmployeeSalary() - o2.getEmployeeSalary());
		}
		
	}
	 
}

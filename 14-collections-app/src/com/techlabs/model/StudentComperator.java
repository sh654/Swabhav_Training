package com.techlabs.model;

import java.util.Comparator;

public class StudentComperator {

	public static class StudentNameComperator implements Comparator<Student>{
		@Override
		public int compare(Student student1, Student student2) {
			// TODO Auto-generated method stub
			return student1.getName().compareTo(student2.getName());
		}
	}
	
	public static class StudentRollNumberComperator implements Comparator<Student>{

		@Override
		public int compare(Student student1, Student student2) {
			// TODO Auto-generated method stub
			if(student1.getRoll() > student2.getRoll())
				return 1;
			if(student1.getRoll() < student2.getRoll())
				return -1;
			return 0;
			
		}

	}
}

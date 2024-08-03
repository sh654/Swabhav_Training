package com.techlabs.test;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.techlabs.model.Student;
import com.techlabs.model.StudentComperator;


public class StudentTest {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int size = scanner.nextInt();
        List<Student> students = new ArrayList<Student>();

        readStudents(students, scanner, size);

        System.out.println("Original list of students:");
        System.out.println(students);

        // Sort students by roll number using StudentRollNumberComparator
        Collections.sort(students, new StudentComperator.StudentRollNumberComperator());

        System.out.println("\nSorted list by roll number using Comparator:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Sort students by name using StudentNameComparator
        compareString(students);

        System.out.println("\nSorted list by name using Comparator:");
        for (Student student : students) {
            System.out.println(student);
        }

        scanner.close();
    }

    private static void readStudents(List<Student> students, Scanner scanner, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print("\nEnter roll no: ");
            int rollno = scanner.nextInt();

            System.out.print("Enter Name: ");
            String name = scanner.next();
            
            System.out.print("Enter marks: ");
            int marks = scanner.nextInt();

            students.add(new Student(name, rollno, marks));
        }
    }

    private static void compareString(List<Student> students) {
        students.sort(new StudentComperator.StudentRollNumberComperator());
    }
}
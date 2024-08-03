package com.techlabs.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class ReflectionOfString {

    public static void main(String[] args) throws ClassNotFoundException {
        // Load the String class
        Class<?> stringClass = Class.forName("java.lang.String");
        
        // Print class name
        System.out.println("Class Name: " + stringClass.getName());
        
        // Print superclass name
        System.out.println("Superclass: " + stringClass.getSuperclass().getName());
        
        // Get and print all methods
        Method[] stringMethods = stringClass.getMethods();
        System.out.println("\nMethods:");
        for (Method method : stringMethods) {
            // Print method name and parameters
            System.out.print(method.getName() + "(");
            Parameter[] parameters = method.getParameters();
            for (int i = 0; i < parameters.length; i++) {
                System.out.print(parameters[i].getType().getName() + " " + parameters[i].getName());
                if (i < parameters.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println(")");
        }
        
        // Get and print all constructors
        Constructor<?>[] stringConstructors = stringClass.getConstructors();
        System.out.println("\nConstructors:");
        for (Constructor<?> constructor : stringConstructors) {
            // Print constructor name
            System.out.print(constructor.getName() + "(");
            Parameter[] parameters = constructor.getParameters();
            for (int i = 0; i < parameters.length; i++) {
                System.out.print(parameters[i].getType().getName() + " " + parameters[i].getName());
                if (i < parameters.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println(")");
        }
    }
}

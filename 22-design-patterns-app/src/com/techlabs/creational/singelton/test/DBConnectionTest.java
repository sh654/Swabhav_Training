package com.techlabs.creational.singelton.test;

import com.techlabs.creational.singelton.model.DbConnection;

public class DBConnectionTest {

	public static void main(String args[]) {
		
		DbConnection dbconnect1 = DbConnection.getDbLogger(); 
		
		dbconnect1.status();
		System.out.println(dbconnect1.hashCode());
		
		DbConnection dbconnect2 = DbConnection.getDbLogger(); 
		
		dbconnect2.status();
		System.out.println(dbconnect2.hashCode());
		
	}
	
}

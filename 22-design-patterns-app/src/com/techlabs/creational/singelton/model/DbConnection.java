package com.techlabs.creational.singelton.model;

public class DbConnection {

	private DbConnection() {
		System.out.println("Logger successful ");
	}
	
	private static DbConnection dblogger;
	
	public static DbConnection getDbLogger() {
		
		if(dblogger == null)
			dblogger = new DbConnection();
		return dblogger;
		
	}
	
	public void status() {
		System.out.println("Logger Created ");
	}
	
}

package com.techlabs.test;

import java.util.Scanner;

public class InputValidator {

	private  String userName;
	private  String password;
	private  String email;
	
	public InputValidator(String userName, String password, String email) {
		this.userName = userName;
		this.password = password;
		this.email = email;
	}
	
	public String getUserName() {
		return this.userName;
	}
	public String getPassword() {
		return this.password;
	}
	
	public String getEmail() {
		return this.email;
	}
	public static boolean validateUsername(String username) {
        if (username == null || username.isEmpty()) {
            return false;
        }
        return 3 <= username.length() && username.length() <= 20;
    }
	
	public static boolean validatePassword(String password) {
		if( password == null || password.isEmpty()) {
			return false;
		}
		return 8 <= password.length() && password.length() <=30;
	}
	
	public static boolean validateEmail(String email) {
		if(email == null || email.isEmpty()) {
			return false;
		}
		return 5<= email.length() && email.length() <=50;
	}
	
	
	

}

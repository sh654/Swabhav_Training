package com.techlabs.creational.singelton.test;

import com.techlabs.creational.singelton.model.Login;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Login login1 = Login.getLogin();
		login1.status();
		System.out.println(login1.hashCode());
		
		Login login2 =Login.getLogin();
		login2.status();
		System.out.println(login2.hashCode());
		
		/* Singleton to restrict more than 1 object we need to do following
			1> Make Constructor as private 
			2> Make a private static reference to store login object
			3> Make a public static method of return type of class and then return new Object to reference variable
			4> add a conditional statement to provide new login only if it dosent exist 
			5> on main method use classname along the public method to get your login and now you are able to make only 1 object 
		*/
	}

}

package com.techlabs.test;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name1 = "Shivam";
		String name2 = "Shivam";
		
		System.out.println(name1.hashCode());
		System.out.println(name2.hashCode());
		
		System.out.println(name1==name2);
		
		String name_1 = new String("carry");
		String name_2 = new String("carry");
		
		System.out.println(name_1.hashCode());
		System.out.println(name_2.hashCode());
		
		System.out.println(name_1==name_2);
		
		name_1 = name_1 + " Upadhyay";
		System.out.println(name_1);
		System.out.println(name_1.hashCode());
		
		StringBuffer name3 = new StringBuffer("Shivam");
		System.out.println(name3.hashCode());
		name3 = name3.append("Upadhyay");
		System.out.println(name3.hashCode());
		
		StringBuilder name4 = new StringBuilder("Omkar");
		System.out.println(name4.hashCode());
		name4 = name4.append("Awalegaonkar");
		System.out.println(name4.hashCode());
		
		
		
	}

}

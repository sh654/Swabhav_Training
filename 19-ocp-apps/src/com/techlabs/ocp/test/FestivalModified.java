package com.techlabs.ocp.test;

import com.techlabs.ocp.solution.FixedDeposit;
import com.techlabs.ocp.solution.Holi;
import com.techlabs.ocp.solution.IFestivalType;

public class FestivalModified {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FixedDeposit festival1 = new FixedDeposit(1, "Shivam", 13000, 5, new Holi());
		System.out.println(festival1.calculateSimpleInterest());
	}

}

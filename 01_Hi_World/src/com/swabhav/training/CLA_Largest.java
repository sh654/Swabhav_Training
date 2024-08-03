package com.swabhav.training;

public class CLA_Largest {
		public static void main(String args[]) {
			
			int num1 = Integer.parseInt(args[0]);
			
			int num2 = Integer.parseInt(args[1]);
			
			int num3 = Integer.parseInt(args[2]);
			
			
			int large = largestofnum(num1, num2, num3);
			System.out.println("Largest of " + num1  + "," + "num2" + "," + "num3 is :" + large);
			
		}
		
		static int largestofnum(int a, int b, int c) {
			if((a>b) && (b>c)) {
				return a;
			}  else if ((b>a) && (b>c)){
				return b;
			}
			else {
				return c;
	        }
		}
}

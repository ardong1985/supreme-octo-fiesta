package day06_controlFlow;

import java.util.Scanner;

public class EligibleToBuyAlgohol {

	public static void main(String[] args) {
		
	  /*String name = "James";
		int Age = 23;
		String message = name + "is eligible to buy algohol?";
		boolean isEligible = Age >=21;
		
		System.out.println(message);
		System.out.println(isEligible);
		
		if (Age >= 21) {
			System.out.println(name + "is eligible to buy algohol");
			System.out.println(true);
		}else {
			System.out.println(name + "is not eligible to buy algohol");
			System.out.println(false);
		}*/
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter your name");		
		
		Scanner s2 = new Scanner(System.in);
		System.out.println("Enter your age");
		
		int Age = 21;
		
		if (Age < 21); {
			System.out.println("Is not eligible to buy algohol");
		}
		if (Age >= 21); {	
			System.out.println("Is eligible to buy algohol");
		}
		
		s1.close();
		s2.close();
		
	}

}

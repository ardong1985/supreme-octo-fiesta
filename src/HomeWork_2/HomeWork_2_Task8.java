package HomeWork_2;

import java.util.Scanner;

public class HomeWork_2_Task8 {

	public static void main(String[] args) {
//		task01: ValidTriangle
//       A triangle is valid if the sum of all the three angles is equal to
//      180 degrees. Write a program that declares three integers as angles
//      and check whether a triangle is valid or not.

		int cor1=60, cor2=60, cor3=60;
		
		Scanner S = new Scanner (System.in);
		System.out.println("Please enter number for first angel");
		cor1 = S.nextInt();
		System.out.println("Please enter number for second angel");
		cor2 = S.nextInt();
		System.out.println("Please enter number for third angel");
		cor3 = S.nextInt();
		
		if (cor1+cor2+cor3==180) {
			System.out.println("Valid Triangle");
		} else {
			System.out.println("Invalid Triangle");
		}
		S.close();	
		
	}

}

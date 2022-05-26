package day07_2ndReview.operator;

import java.util.Scanner;

public class Solution_B {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		String strA = scanner.nextLine();
		int numA = scanner.nextInt();
		int numB = scanner.nextInt();
		
		System.out.println("My string is " + strA);
		System.out.println("The sum of the " + numA + " and " + numB + " is " + numA + numB);
		System.out.printf("The sum of the %d and %d is %d", numA, numB, numA + numB);
		
		scanner.close();
	}

}

package day07_2ndReview.operator;

import java.util.Scanner;

public class Solution_A {

	public static void main(String[] args) {
		/*
		 * ## Task - A
		you should create a new class called `Solution_A`
	  	Write program that can check the order of the 3 integer inputs.
	  	if the order that input integer
	  	are in descending order (high -> low).
	  	the program should return `true`, otherwise return `false`

		Input 1
		> 185 178 172

		Output 1
		> true

		Input 2
		> 181 184 177

		Output 2
		> false
		 */

		Scanner	scanner = new Scanner (System.in);
		int numA = scanner.nextInt();
		int numB = scanner.nextInt();
		int numC = scanner.nextInt();
		System.out.printf("%d %d %d", numA, numB, numC);
		
		// (numA > numB ==> numb > numC ==> print true
		if (numA > numB && numB > numC) {
				System.out.println("true");	
		} else {
			System.out.println("false"); {
		}
		scanner.close(); //at the end
	}
		
}
					
	}



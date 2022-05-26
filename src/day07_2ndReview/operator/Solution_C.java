package day07_2ndReview.operator;

import java.util.Scanner;

public class Solution_C {

	public static void main(String[] args) {
//## Task C - Plus or Minus Ten
//- Create the new class, called `Solution_C`
//- Write a program that reads a input from user
//- It should print `true` if value is in between -10 and 10. or `false` otherwise.
//Sample Input:
//> 5
//Sample Output:
//> true
//Sample Input:
//> -15
//Sample Output:
//> false
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Input Number");
		int a = scan.nextInt();
		
		if (a >= -10 && a <= 10) {
			System.out.println("true");
		} else
			System.out.println("false");
		
		scan.close();
	}

}

package day07_2ndReview.operator;

import java.util.Scanner;

public class Solution_D {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("What is driver first name?");
		String fn = sc.next();
		System.out.println("What is driver last name?");
		String ln = sc.next();
		System.out.println("What is driver's age?");
		int age = sc.nextInt();
		System.out.println("What is the speed limit?");
		int speedLimit = sc.nextInt();
		System.out.println("What is the speed limit? (mph)");
		int actualSpeed = sc.nextInt();
		double fine = 0;
		System.out.println("Is this a construction zone (Y/N)?");
		char isConstructionZone = sc.next().charAt(0);
//		int overSpeedLimit = actualSpeed - speedLimit;
		int overSpeedLimit = 17;
		
		if (overSpeedLimit > 5 && overSpeedLimit <= 20) {
		   fine = (overSpeedLimit/5)*30;	// every 5mph over, charge 30 each
		} else if (overSpeedLimit > 20) {	// overSpeedLimit greater 20mph
		   fine = (overSpeedLimit/5)*50;	// every 5mph over, charge 50 each
		}
		if (isConstructionZone == 'Y') fine = fine * 2;
		if (age < 21 && overSpeedLimit > 20) fine = fine + 300;
		
		System.out.println("=====================");
		System.out.printf("Driver name: \n\t%s %s",fn,ln);
		System.out.println();
		System.out.printf("Speed limit: \t%d mph",speedLimit);
		System.out.println();
		System.out.printf("Current Speed: \t%d mph",actualSpeed);
		System.out.println();
		System.out.printf("Construction Zone (Y/N)?%c",isConstructionZone);
		System.out.println();
		System.out.printf("Speedind fine: $%.2f",fine);
		System.out.println("=====================");
		
		System.out.println(fine);
	}

}

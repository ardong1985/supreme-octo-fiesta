package day05_operators;

import java.util.Scanner;

public class ScannerPractice {

	public static void main(String[] args) {
		
		Scanner irfan = new Scanner(System.in);
		
		int a = 1;
		int b = 2;
		int c = 3;
		
		System.out.println("Please type value a");
		//int a = 1;
		a = irfan.nextInt();
		
		System.out.println("Please type value b");
		//int b = 2;
		b = irfan.nextInt();
		
		System.out.println("Please type value c");
		//int c = 3;
		c = irfan.nextInt();
		
		System.out.println(a+b > c);
		
		irfan.close();
		
		System.out.println(a+b > c);

		
		
	}

}

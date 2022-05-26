package day05_operators;

import java.util.Scanner;

public class ScannerObject {

	public static void main(String[] args) {
		
		//Create instance of scanner object
		
		Scanner s = new Scanner(System.in);
			
		System.out.println("Please type num A");
//		int a = 20
		int a = s.nextInt();
		
		System.out.println("Please type num b");
//      int b = 20;
		int b = s.nextInt();
	
		int result = a + b;
		
		System.out.println(result);
		
		s.close();
		
		System.out.println("What's your name?");
		
		String name = s.nextLine();
		
		System.out.println("Hello"+name);
		
		s.close();		

	}

}

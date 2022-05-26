package HomeWork_1;

import java.util.Scanner;

public class HomeWorkTask8 {

	public static void main(String[] args) {
		
		Scanner S = new Scanner(System.in);
		int N = S.nextInt();
		
		System.out.println("Please enter the number");
		
		if (N%2 == 0) {
			System.out.println("This is even number");
		} else
		if (N%2 == 1) {
			System.out.println("This is odd number");
		}

		
	}

}

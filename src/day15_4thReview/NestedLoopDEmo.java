package day15_4thReview;

import java.util.Scanner;

public class NestedLoopDEmo {

	public static void main(String[] args) {
		// do, do while, for
		// 
		// 
		for (int row = 0; row < 8; row++) {
			for (int column =1; column <= 5; column++) {
				System.out.println(column+" ");
			}
			System.out.println();
		}
		for (int row = 0; row < 8; row++) {
			System.out.println(row);
			if (row == 5) break;	
 		}
			Scanner S = new Scanner(System.in);
		while (true) {			
			String input = S.next();
			if (input.equals("exit")) break;
			System.out.println(input);
			System.out.println("=======");
		}
	}

}

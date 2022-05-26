package HomeWork_1;

import java.util.Scanner;

public class HomeWorkTask5 {

	public static void main(String[] args) {
		
		Scanner S = new Scanner(System.in);
		
		System.out.println("What time it is?");
		
		String G1 = "Good Morning'";
		String G2 = "Good Afternoon";
		String G3 = "Good Evening";
		
		double time = S.nextInt();
		
		if (time >= 5.00 && time <=11.59) {	
			System.out.println(G1);
		}
		if (time >= 12 && time <= 16.59) {
			System.out.println(G2);
		}
		if (time >= 17 && time <= 24) {
			System.out.println(G3);
		} else {
			System.out.println("Invalid");
		}	
		S.close();

	}

}

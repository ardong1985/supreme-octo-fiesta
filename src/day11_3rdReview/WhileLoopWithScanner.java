package day11_3rdReview;

import java.util.Scanner;

public class WhileLoopWithScanner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		do {
			int elem = sc.nextInt();
			sum += elem;
		} while (sc.hasNextInt());
		    System.out.println(sum);
		sc.close();
		
		//buy = "Buy something"
		//sell = "Sell something"
		
		Scanner scan = new Scanner(System.in);
		String input = "";
		while (!input.equals("quit")) {
			input = scan.next();
			switch (input) {
			case "buy":
				System.out.println("Buy something");
				break;
			case "sell":
				System.out.println("Sell something");
				break;
			case "quit":
				break;
			default:
				System.out.println("Invalid command. Try again");			
			}
		}
			scan.close();
		
		
	}

}

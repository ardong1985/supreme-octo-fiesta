package day09_control_flow_loops;

public class Task1_Print20_To_30 {

	public static void main(String[] args) {
		
		// while loop
//		while (condition) {
//			statement
//		}
		System.out.println("While Loop");
		int num = 20;
		while (num <= 30) {
			System.out.println(num);
			num++;
		}
		
		System.out.println("Current value of varaible num is " + num);
		
		num = 20;
		
		System.out.println("Do while loop");
		
//		do {
//			your code
//		}while (condition is true);
//		}
		
		do {
			System.out.println(num);
			num++;
		}while(num <= 30);
		
		System.out.println("For loop");
		
//		for (statement ; statement 2 ; statement 3) {
//			your code
//		}
		
		for (int i = 20; i < 31; i++) {
			System.out.println(i);
		}
		
	}

}

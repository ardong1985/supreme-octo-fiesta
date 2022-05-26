package HomeWork_2;

import java.util.Scanner;

public class HomeWork_2_Task7 {

	public static void main(String[] args) {
// 1write a program that can find the number of days in a month. 
//		Note: MUST USE NESTED IF

		Scanner S = new Scanner(System.in);
		System.out.println("Enter month between (1-12)");
		int month = 1;
		month = S.nextInt();
		
		if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12) {
			System.out.println("This month has 31 days");
		}
		if(month==4 || month==6 || month==9 || month==11) {
			System.out.println("This month has 30 days");
		}
		if(month==2) {
			System.out.println("This month has 28 days or 29 days if Leap Year");
		}
		if(month < 1 || month > 12) {
			System.out.println("Invalid month");
		}
		S.close();
	}

}

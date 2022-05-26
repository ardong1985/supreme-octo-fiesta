package day11_3rdReview;

public class Task_2 {

	public static void main(String[] args) {
		
		//write program that count number of digits in number
		//example:
		//5678745
		//5678745 has 7 digit
		
		int count = 0;
		int number = 5678745;
		int startNumber = number;
		while (number != 0) {
			number = number / 10;
			count++;
		}
		System.out.printf("%s has %s digits", startNumber,count);
	}

}

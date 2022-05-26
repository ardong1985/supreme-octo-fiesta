package day14_StringReview;

public class Task_3 {

	public static void main(String[] args) {
/*
 * ## Task3
   write a program that asks user to enter two strings, and print out the longest string
 */
		String str1 = "ake";
		String str2 = "kong";
		
		if (str1.length() > str2.length()) {
			System.out.println(str1);
		} else {
			System.out.println(str2);
		}
		
	}

}

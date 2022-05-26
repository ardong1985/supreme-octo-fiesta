package day14_StringReview;

public class Task_2 {

	public static void main(String[] args) {
/*
 * Create a class called Reverse, write a program that will reverse a string.
    Your program should reverse a string only 5 characters long.
    If word is shorter, display message: "Too short!".
    If word is longer, display message: "Too long!".
    Otherwise, reverse this word and print out result into the console.
 */
		
		String word = "TechCircle";
		
		if (word.length() == 5) {
//		    System.out.print(word.charAt(4));
//		    System.out.print(word.charAt(3));
//		    System.out.print(word.charAt(2));
//		    System.out.print(word.charAt(1));
//		    System.out.print(word.charAt(0));
//		    System.out.println();
			for (int i = 4; i >= 0; i++) {
				System.out.println(word.charAt(i));
			}
		} else if (word.length() > 5) {
			System.out.println("Too long");
		} else {	
			System.out.println("Too short");			
		} 

	}

}

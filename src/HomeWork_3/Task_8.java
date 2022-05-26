package HomeWork_3;

public class Task_8 {

	public static void main(String[] args) {

// ## Task7
// Write a program that can return the factorial number of any given number
// Example:
// input: 5
// output: 120
// (because: 5! = 5 * 4 * 3 * 2* 1 = 120 )

	int fact = 1;
	
	for (int i = 1; i <= 5; i++) {
		fact *= i;
	}
	System.out.println("Factorial number is "+ fact);		
		
	}

}

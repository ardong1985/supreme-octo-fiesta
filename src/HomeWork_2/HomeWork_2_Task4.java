package HomeWork_2;

public class HomeWork_2_Task4 {

	public static void main(String[] args) {
		
// Write a java program to print sum of even number between 1 to 100.	
		
		int even = 0;
		
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
			//eve = eve + i;
			even = even + i;
			}	
		}
		System.out.println("even=" + even);
	}
}

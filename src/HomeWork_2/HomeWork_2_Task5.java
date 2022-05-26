package HomeWork_2;

public class HomeWork_2_Task5 {

	public static void main(String[] args) {
		
// Write a java program to print sum of odd number between 1 to 100.
	
		int odd = 0;
		
		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0) {
			//odd = odd + i;
			odd = odd + i;
			}			
		}
		System.out.println("odd=" + odd);
	}

}

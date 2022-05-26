package day15_4thReview;

public class ContinueStatement {

	public static void main(String[] args) {
		// print odd number		
		int n = 10;
		for (int i = 0; i < n; i++) {
			if (i % 2 != 0) {
				continue;
			}
			System.out.println(i+" "     );
		}
		// print equal number
		int a = 10;
		for (int b = 0; b < a; b++) {
			if (b % 2 == 0) {
				continue;
		}
			System.out.println(b+" "     );	
	}

	}
}

package day10_LoopReview;

public class SumOfNumber {

	public static void main(String[] args) {
		// Write a java program to print sum of even number between 1 to 100.
		// 2 + 4 + 6 + 8 + ..100
		
		int num = 100;
		
		for (int i = 1 ; i <= 100 ; i++) {
			if (i % 2 == 0) {
//				System.out.println(i);
				num = num + i;
			}	
		}
		System.out.println(num);
		
//		int total = 0;
		
//		int count = 1;
//		while (count <= 100) {
//			if (count % 2 == 0)
//			{
//			total += count; //total = total + count
//			}
//			count++;
				
//		}	
//		System.out.println(total);

		
	}

}

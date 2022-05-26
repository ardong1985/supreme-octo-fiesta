package day10_LoopReview;

public class MultiplicationTable {

	public static void main(String[] args) {
		
		int num = 5;
	 //  1 x 5 = 5
	 //  2 X 5 = 10
	 //	 3 X 5 = 15
	 //	 4 X 5 = 20
	 //	 5 X % = 30
	 // 10 X 5 = 50

		
		for (int i = 1 ; i < 11; i++) {
			int total = i * num;
			System.out.println(i + " X " + num + " = " + total);

		}
			
	}

}

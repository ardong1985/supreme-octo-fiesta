package day10_LoopReview;

public class ValidTriangel {

	public static void main(String[] args) {
		
//	   task01: ValidTriangle
//     A triangle is valid if the sum of all the three angles is equal to
//     180 degrees. Write a program that declares three integers as angles
//     and check whether a triangle is valid or not.
		
		int a = 90;
		int b = 60;
		int c = 30;
		
		if (a + b + c == 180) {
			System.out.println("Its a valid triangel");
		} else {
			System.out.println("Invalid Triangel");
		}

	}

}

package day07_2ndReview.operator;

public class Solution_G {

	public static void main(String[] args) {
/*	Given an integer `n` , perform the following conditional actions:
	- If `n` is odd, print `Weird`
	- If `n` is even and in the inclusive range of `2` to `5` , print `Not Weird`
	- If `n` is even and in the inclusive range of `6` to `20` , print `Weird`
	- If `n` is even and greater than `20`, print `Not Weird`
	### Input Format
	A single line containing a positive integer `n` .
	### Constraints
	- 1 <= `n` <= 100
	### Output Format
	Print `Weird` if the number is weird; otherwise, print `Not Weird`.
	Sample Input 0
	> 3
	Sample Output 0
	> Weird
	Sample Input 1
	> 24
	Sample Output 1
	> Not Weird
*/
		int n = 4;
		
		if (n % 2 != 0) { // if n is odd
			System.out.println("weird");
		} else { // if n is even
			// 2 3 4 5
			if (n >= 2 && n <= 5) // inclusive range of 2 to 5
				System.out.println("not weird");
		  else if (n <= 20) // inclusive range of 6 t0 20
			System.out.println("weird");
		  else // greater than 20
			System.out.println("not weird");			
		}

	}

}

package day07_2ndReview.operator;

public class Solution_H {

	public static void main(String[] args) {
/*You and your date are trying to get a table at a restaurant.
  The parameter "you" is the stylishness of your clothes, in the range 0..10, and "date" is the
  stylishness of your date's clothes.
  **Rule for getting a table**
  - Write program that take 2 input from user in one line. 1st value is your stylishness & 2nd value
    is your date's stylishness
  - If either of you is very stylish, 8 or more, then the result
    is `Yes, you both will definitely get a table`
  - With the exception that if either of you has style of 2 or less, then the result is
    `Sorry, but no table for both of you`.
  - Otherwise, the result is 1 `Ahh, you maybe lucky tonight`.
  **Example:**
  ```text
  What are you and your date stylishness?
  > 5 10
  Yes, you both will definitely get a table
  What are you and your date stylishness?
  > 2 8
  Sorry, but no table for both of you
  What are you and your date stylishness?
  > 5 5
  Ahh, you maybe lucky tonight 
*/
		int stylishness_Me = 2;
		int stylishness_Date = 5;
		
		if (stylishness_Me >= 2 || stylishness_Date >= 2) {
			System.out.println("Sorry, but no table for both of you");
		} else if (stylishness_Me >= 8 || stylishness_Date >= 8) {
			System.out.println("Yes, you both will definitely get a table");
		} else {
			System.out.println("Ahh, you maybe lucky tonight");
		}
		
	}

}

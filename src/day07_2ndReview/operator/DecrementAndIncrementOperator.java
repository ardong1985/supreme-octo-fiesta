package day07_2ndReview.operator;

public class DecrementAndIncrementOperator {

	public static void main(String[] args) {
		
		// Prefix and Postfix
		// ++ , --
		int x = 1;
		int y = x++;
		System.out.println(x + " , " + y);
		
		int i = 1;
		int j = ++i;
		System.out.println(i + " , " + j);
		
		char a = 'a';
		char b = 'b';
		char c = 'c';
		
		char ch = 'c';
		ch -= 'b'; // ch = ch - 'b'
		ch += 'c'; // ch = ch - 'c'
		System.out.println(ch);
				

	}

}

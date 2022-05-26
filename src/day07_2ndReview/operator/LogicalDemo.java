package day07_2ndReview.operator;

public class LogicalDemo {

	public static void main(String[] args) {
		// Logical Operator = Boolean expression
		// result always be 'true' or 'false'
		// Not - ! = Unary Operator
		
		boolean isTall = true;
		System.out.println(!isTall); // false
		
		// AND - && => Binary Operator
		// all of operands need to be 'true', then result == "true'
		boolean b1 = false && false; // false
		boolean b2 = false && true; // false
		boolean b3 = true && false; // false
		boolean b4 = true && true; // true
		
		System.out.println(false & true && 10 > 3 && true); // false
		// OR - ||
		// At least one of operand is 'true' , then result == 'true'
		
		//								true
		//							true || false
		System.out.println(true || false || false || true);
		
		// Precedence of logical operator
		/*
		 1. ()
		 2. !
		 3. && , ||
		 */
		
		boolean b = true && !false;
		System.out.println(b);
		//					true	&&    true
		boolean b10 = (false || true) && !false;
		System.out.println(b);
		
		boolean isHandsome = true;
		boolean isRich = true;
		boolean isMytype = isHandsome && isRich;
		System.out.println(isMytype);
		
		

	}

}

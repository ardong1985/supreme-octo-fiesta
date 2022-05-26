package Sat_1stReview;

import java.awt.Point;

public class PrimitiveVSReference {

	public static void main(String[] args) {
		int x = 1; // initialized x to 1
		int y = x; // assign x into y
		x = 2; // reassign x to 2
		System.out.println("x="+x+",y="+y);
	
		//============================
// Reference Type Variable or Non-Peimitive
		
		Point pointA = new Point(1, 1); // 1,1
		Point pointB = pointA; // 1,1
		pointA.y = 2; // 1,2
		System.out.println("PointA="+pointA+",PointB="+pointB);
	
// Primitive
// byte, short, int, long, float, double, boolean, char
// byte = 127
int maxOfByte = Byte.MAX_VALUE;
System.out.println(maxOfByte);

// Reference
// String

// Constant or Final Variable = variable that cannot be reassigned. it is final
// Syntax
final byte DAY_OF_THE_WEEK; // Naming convention = screening snake case
//DAY_OF_THE_WEEK

//DAY_OF_THE_WEEK = 8; | You, Today . Uncommited change

// 

    
	}

}

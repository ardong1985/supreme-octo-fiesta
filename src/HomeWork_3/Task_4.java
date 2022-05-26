package HomeWork_3;

import java.util.Scanner;

public class Task_4 {

	public static void main(String[] args) {
		
/*
 * ## Task4

`Write a program that can calculate the salary after tax based on the following requirements
                the tax rates are:
                35% for salary of 130K or more
      			30% for salary of 100K to 130k (excluded)
      			25% for salary of 80K to 100K (excluded)
      			20% for salary less than 80K
                in addition, if the person is married, he/she will pay 5% less tax
 */

		int saraly = 100000;
		double taxA = 0;
		double taxB = 0;
		double taxC = 0;
		boolean marry = true;		
		if (saraly >= 0 && saraly < 80000) {
		taxA = saraly * .20;		
		} else if (saraly >= 80000 && saraly < 100000) {
			taxA = 80000 * .20;
			taxB = (saraly - 80000) * .25;
			taxC = taxA + taxB;
		} else if (saraly >= 100000 && saraly < 130000) {
			taxA = 80000 * .20;
			taxB = (saraly - 80000) * .30;
			taxC = taxA + taxB;
		} else if (saraly >= 130000) {
			taxA = 80000 * .20;
			taxB = (saraly - 80000) * .35;
			taxC = taxA + taxB;
		} 
		if (marry) {
			taxC = taxC * .95;
		}
		System.out.println("Total net saraly after tax = " + (saraly - taxC));
	}

}
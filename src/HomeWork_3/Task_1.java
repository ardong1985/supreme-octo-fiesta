package HomeWork_3;

public class Task_1 {

	public static void main(String[] args) {
/*
 * # Task1
`Create a class called SalaryCalculator.java
			1 declare the following variables:
					hourlyRate, weeklyHours, stateTaxRate, federalTaxRate
			2 use the given info in above variables to calculate the followings:
					1. salaryBeforeTax
					2. stateTax
					3. federalTax
					4. totalTax
					5. salaryAfterTax
					Hint: salaryBeforeTax = hourlyRate * weeklyHour * 52
			3 use print statement to print each of the above
				Example:
					   hourlyRate = $50
					   weeklyHours = 45
					   stateTaxRate = 6 (given as percentage, you need to convert to decimal)
					   federalTaxRate = 26 (given as percentage, you need to convert to decimal)
				    output:
				    	Gross pay is: $117000
				    	Federal tax is: $30420
			    		State tax is: $7020
			    		Total tax is: $37440
			    		Net income is: 79560
 */

		int hourlyRate = 50;
		int weeklyHours = 45;
		double stateTaxRate = 6.0;
		
		System.out.println("What is your gross pay?");
		int grossPay = (hourlyRate * weeklyHours * 52);
		System.out.println(grossPay);
		System.out.println("What is your federal tax?");
		int federalTax = (grossPay * 26 / 100);
		System.out.println(federalTax);
		System.out.println("What is your State tax?");
		int stateTax = (grossPay * 6 / 100);
		System.out.println(stateTax);
		System.out.println("What is your total tax?");
		int totalTax = (federalTax + stateTax);
		System.out.println(totalTax);
		System.out.println("Your total net income");
		int netIncome = (grossPay - totalTax);
		System.out.println(netIncome);
		
		
		
	
		
		
		
		
		
		
		
		
	}

}

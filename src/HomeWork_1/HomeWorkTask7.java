package HomeWork_1;

import java.util.Scanner;

public class HomeWorkTask7 {

	public static void main(String[] args) {
		
		Scanner S = new Scanner(System.in);
		System.out.println("Who is planning to vote?");

		String Name = "";

		Name = S.next();

		System.out.println("How old is"+ Name +"?");

		int Age = S.nextInt();
		System.out.println("Is"+ Name +"US Citizen?");

		boolean Yes = true;
		boolean No = false;

		String Answer = S.next();

		if (Age >= 18 && Yes) {
		System.out.println(Name + "is eligible to vote");
		}
		if (Age <18 || No) {
		System.out.println(Name + "isn't eligible to vote");
		}

		S.close();

	}

}

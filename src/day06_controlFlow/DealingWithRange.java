package day06_controlFlow;

import java.util.Scanner;

public class DealingWithRange {

	public static void main(String[] args) {
			
		Scanner scan = new Scanner(System.in);
		int bathTemperature = scan.nextInt();
		
		System.out.println("Enter your temperature:");
		
		if (bathTemperature < 90); {
			System.out.println("brrr!");
		}
		if (bathTemperature > 90 && bathTemperature < 95); {
			System.out.println("That's lukewarm.");
		}
		if (bathTemperature >= 95 && bathTemperature < 105); {
			System.out.println("Perfect!");
		}
		if (bathTemperature >= 105 && bathTemperature < 110); {
			System.out.println("This isn't a hot tub");
		}
		if (bathTemperature > 110); {
			System.out.println("Are you trying to boil a lobster?");
		}
	
	}



	



	



	

	
	
	}
	
		
	
	
	
		
	
	
	
	
	
	
	



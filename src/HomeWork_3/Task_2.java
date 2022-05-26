package HomeWork_3;

public class Task_2 {

	public static void main(String[] args) {
/*
 * 	## Task2
` 	Create a class called CampusTime, an integer variable named time is 
	given with a number between 1~24 has
	been initialized, write a program that can find out if the campus is open or not.
 	Campus is open from 8 am(8) to 11pm (23) If user enters a time within the open 
 	time they should see message: “open”  but if the time entered is
	outside of operating hours they should see: “ closed”
*/
		int campusTime = 9;
		if (campusTime >= 8 && campusTime <= 23) {
			System.out.println("Open");
		} else {
			System.out.println("Closed");
		}
		
		
		
		
	}

}

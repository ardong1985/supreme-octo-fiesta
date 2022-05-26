package day09_control_flow_loops;

public class While_Loop {

	public static void main(String[] args) {
		
		int i = 0;
		
		while (i < 5) {
			System.out.println(i);
			i++;
		while (i < 5) {
			break;
		}
			
		int x = 10;
		int y = 20;
		
		while (x < y) {
			System.out.println("Value of x is "+ x);
			x++;
		}
		
		if (true) {
			System.out.println("Hello cohort 11");
		}
		System.out.println("-------------------");
		
		int count = 0;
		
		while (true) {
			System.out.println("Hello cohort 11");
			
			if (count == 4) {
				break;
			}
			count++;
		}
			
			
		}

	}
	}	


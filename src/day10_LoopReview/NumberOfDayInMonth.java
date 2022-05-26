package day10_LoopReview;

public class NumberOfDayInMonth {

	public static void main(String[] args) {
// way3		
		int month = 4;
		int days = 0;
		if (month == 1) {
			days = 31;
		} else if (month == 2) {
			days = 28;
		} else if (month == 3) {
			days = 31;
		} else if (month == 4) {
			days = 30;
		} else if (month == 5) {
			days = 31;
		} else if (month == 6) {
			days = 30;
		} else if (month == 7) {
			days = 31;
		} else if (month == 8) {
			days = 31;
		} else if (month == 9) {
			days = 30;
		} else if (month == 10) {
			days = 31;
		} else if (month == 11) {
			days = 30;
		} else if (month == 12) {
			days = 31;
		}
//Way 2
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			days = 31;
			break;
		case 2:
			days = 28;
			break;
			default:
			days = 30;
		}
		System.out.println(days);
// way 3
		System.out.println(days);
		
		if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12) {
			System.out.println("Has 31 days");
		}
		if(month==4 || month==6 || month==9 || month==11) {
			System.out.println("Has 30 days");
		}
		if(month==2) {
			System.out.println("Has 28 days or 29 days if Leap Year");
		}
		if(month < 1 || month > 12) {
			System.out.println("Invalid");			
		}
// way 4
		boolean has30days = (month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12) ? true : false;
		boolean has31days = (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) ? true : false;
        boolean has28days = (month == 2 ) ? true : false;
  
        if (has30days) {
            System.out.println("Has 30 days");
        }
        if (has31days) {
            System.out.println("Has 31 days");
        } 
        if (has28days) {
            System.out.println("Has 28 days");          
        }
        
	}

}

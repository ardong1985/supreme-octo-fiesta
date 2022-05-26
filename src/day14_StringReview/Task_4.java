package day14_StringReview;

public class Task_4 {

	public static void main(String[] args) {

        String str = "MammamiaMa";
        
        char first = str.charAt(0);
        char last = str.charAt(str.length() - 1);
        
        if(first == last) {
            System.out.println("Same");
        }else {
            System.out.println("Different");			
		}
		
		
	}

}

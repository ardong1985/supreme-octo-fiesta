package day03_1stReview;

public class PrintingStuff {

	public static void main(String[] args) {
		System.out.println(); // print to the console then end with new line
		System.out.print("Hello");
		System.out.print("World");
        System.out.printf("Hello World");
        // %s = string
        // %d = digit (byte, short, int, long)
        // %f = float (float, double)
        // %b = boolean
        // %.2f = 3.457
        
        int age = 31;
        String message = "World";
        boolean isEligible = false;
        //                        v           v
        System.out.printf("Hello %s! Leng is %d",message,age);
        System.out.println();
        System.out.printf("Leng is %d years old.",age);
        System.out.println();
        System.out.printf("Price is %.3f cheaper",4.35);
        System.out.println();
        System.out.printf("%b is not eligible", isEligible);
        System.out.println();
        System.out.printf("%s %s %d %f","My","age",age,3.42);
        System.out.println();
        
        System.out.printf("Hello My name is %s", "irfan");
        
        System.out.println();
        
        System.out.printf("Is sunny today? %b",false);
        
        
	}

}

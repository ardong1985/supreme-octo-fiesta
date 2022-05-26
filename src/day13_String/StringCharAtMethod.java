package day13_String;

public class StringCharAtMethod {

	public static void main(String[] args) {
//					   0123456789
		String name = "TechCircle";

		System.out.println(name.charAt(0)); // T
		System.out.println(name.charAt(1)); // e
		System.out.println(name.charAt(2)); // c
		System.out.println(name.charAt(3)); // h
		System.out.println(name.charAt(4)); // c
		System.out.println(name.charAt(5)); // i
		System.out.println(name.charAt(6)); // r
		System.out.println(name.charAt(7)); // c
		System.out.println(name.charAt(8)); // l
		System.out.println(name.charAt(9)); // e
		
		for (int i = 0 ; i < name.length() ; i++) {		
			System.out.println(name.charAt(i));
		}
	}

}

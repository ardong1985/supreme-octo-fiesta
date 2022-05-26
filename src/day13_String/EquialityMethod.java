package day13_String;

public class EquialityMethod {

	private static String team;

	public static void main(String[] args) {
		
	String word1 = "Hello";
	String word2 = "hello";
	
	String str1 = "hello";
	String str2 = "Hello";
	
	System.out.println(str1.equals(str2)); // false
	System.out.println(str1.equalsIgnoreCase(str2));
	
	if (str1.equals(str2)) {
		System.out.println(str2);
	}
	
	boolean b = word1.equals(word2);
		// returns true if the string word1 is equal to word2
		    b = word1.equalsIgnoreCase(word2);
		// returns true if the string word1 matches word2, case-blind
		    
	b = "Raiders".equals("Raiders"); //true
	b = "Raiders".equals("raiders"); //false
	b = "Raiders".equalsIgnoreCase("raiders"); //true
		
	if (team.equalsIgnoreCase("raiders"))
		System.out.println("Go You " + team);

	}

}

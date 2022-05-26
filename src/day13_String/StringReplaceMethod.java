package day13_String;

public class StringReplaceMethod {

	public static void main(String[] args) {
		
		String word = "car";
			   word = word.replace('r', 't');
			   System.out.println(word);
			   
		String str = "tomato";
		System.out.println(str);
		
		str = str.replace('t', 'p');
		System.out.println(str);
		
		String str1 = "tomato";
		System.out.println(str1);
		
		str1 = str1.replace("to", "mo");
		System.out.println(str1);
		
		String str3 = "How Turkey spoiled NATO's historic moment with Finland, Sweden";
		str3 = str3.replace("Turkey", "Thailand");
		System.out.println(str3);
		
		String word2 = "Hello TechCircle";
		word2 = word2.replace("TechCircle", "Ake");
		System.out.println(word2);

	}

}

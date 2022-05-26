package day13_String;

public class GetDomainName {

	public static void main(String[] args) {
//					    01234567890		
		String email = "help@walmart.com";
		System.out.println(email.indexOf('0'));
		
		System.out.println(email.substring(4));
		System.out.println(email.substring(4 + 1));
		System.out.println(email.lastIndexOf('.'));
		
		System.out.println(email.substring(4+1, 12));
		
		int startingIndex = email.indexOf('@') + 1;
		int endingIndex = email.indexOf('.');
		
		String domainName = email.substring(startingIndex, endingIndex);
		
		System.out.println(domainName);
	}

}

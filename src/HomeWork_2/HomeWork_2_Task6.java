package HomeWork_2;

import java.util.Scanner;

public class HomeWork_2_Task6 {

	public static void main(String[] args) {
//  valid browsers: chrome, firefox, opera, safari, edge, ie		 
//	string str = "chrome"		 
//	OutPut:
//	CHROME BROWSER IS SELECTED
		 
	Scanner S = new Scanner(System.in);
	String str = "chrome";
	
	switch (str) {
	case "chrome":
		System.out.println("chrome is browser selected");
		break;
	case "firefox":
		System.out.println("firefox is browser selected");
		break;
	case "opera":
		System.out.println("opera is browser selected");
		break;
	case "safari":
		System.out.println("safari is browser selected");
		break;
	case "edge":
		System.out.println("edge is browser selected");
		break;		
	}
	S.close();
	
	


	}

}

package day09_control_flow_loops;

public class ForLoop {

	public static void main(String[] args) {
		
	int count = 1;
	
	while (count <= 10) {
		System.out.println(count);
		count ++;
	}

//	if () {}
	for (int i = 1 ; i <= 10; i++) {
		System.out.println("Hello");
	}
	for (int i = 1 ; i <= 10; i++) {
		System.out.println(i);
	}
	
	System.out.println("---------------");
	
	for (int i = 1 ; i < 101 ; i++) {
		System.out.println(i);
	}
	
	//Create a for 10 to 30
	
	int ake = 10;
	while (ake <=30) {
		System.out.println(ake);
		ake ++;
	}
	
	for (int tp = 10 ; tp <= 30 ; tp++) {
		System.out.println(tp);
	}
	
	//Create a for 25 to 50
	
	int janis = 25;
	while (janis <=50) {
		System.out.println(janis);
		janis ++;
	}
	
	for (int jm = 25 ; jm <= 50 ; jm++) {
		System.out.println(jm);
		jm ++;
	}
	
	}

}

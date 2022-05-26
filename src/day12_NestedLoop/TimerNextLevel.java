package day12_NestedLoop;

public class TimerNextLevel {

	public static void main(String[] args) throws InterruptedException {
		
		int waitTime = 1;
		
		System.out.println(waitTime + "timer start!");
		
		for (int i = waitTime - 1 ; i >= 0 ; i--) {
//			System.out.println(i);
			for (int j = 59 ; j >= 0 ; j--) {
				System.out.println(i + ":" + j);
				Thread.sleep(1000);
		}			
	}
		System.err.println("Time's UP!!!");
	}

}

package sample;

public class ThreadExam05{
	public static void main(String[] args) {
		Thread t1 = new ThreadEx_05_1();
		Thread t2 = new ThreadEx_05_2();
		
		t1.start();
		t2.start();
		
		try {
			Thread.sleep(2000);
			// sleep은 static method에요!
		} catch (Exception e) {
			
		}
	}
}
class ThreadEx_05_1 extends Thread {
	
	public void run() {

		for(int i = 0 ; i<300 ; i++) {
			try {
				Thread.sleep(2);
				// sleep은 static method에요!
			} catch (Exception e) {
				
			}
			System.out.print("_");
		}
		System.out.println("<< Thread 1 종료 >>");
	}
}



class ThreadEx_05_2 extends Thread {
	
	public void run() {
		for(int i = 0 ; i<300 ; i++) {
			System.out.print("|");
		}
		System.out.println("<< Thread 2 종료 >>");
	}
}



 
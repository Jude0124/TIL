package sample;

class ThreadEx_07 implements Runnable{
	@Override
	public void run() {
		while(true) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);  //현재 동작하는 Thread를  1초 재워요!
			} catch (Exception e) {
				
			}
		}
	}
}


public class ThreadExam07 {

	public static void main(String[] args) {
		
		ThreadEx_07 r = new ThreadEx_07();
		
		Thread t1 = new Thread(r,"*");
		Thread t2 = new Thread(r,"**");
		Thread t3 = new Thread(r,"***");
		
		t1.start();
		t2.start();
		t3.start();

		try {
			Thread.sleep(2000);		// main thread가 자요!
			t1.suspend();			// Thread t1을 일시중지
			Thread.sleep(2000);		// main thread가 자요!
			t2.suspend();			// Thread t2을 일시중지
			Thread.sleep(3000);		// main thread가 자요!
			t1.resume();			// Thread t1을 다시 동작
			Thread.sleep(3000);		// main thread가 자요!
			t1.stop();				 
			t2.stop();				 
			Thread.sleep(2000);
			t3.stop();
			
		} catch (Exception e) {
			
		}
	
	}

}

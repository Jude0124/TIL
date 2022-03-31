package sample;

class ThreadEx_08 implements Runnable{
	
	volatile boolean suspended = false;	// 만약 suspend되면 이 값이 true
	volatile boolean stopped = false;	// 만약 stop이 되면 이 값이 true
	
	
	@Override
	public void run() {
		while(!stopped) {
			if(!suspended) {
				System.out.println(Thread.currentThread().getName());
				try {
					Thread.sleep(1000);  //현재 동작하는 Thread를  1초 재워요!
				} catch (Exception e) {
				
				}
			}
		}
	}
	
	public void suspend() {
		suspended = true;
	}
	
	public void stop() {
		stopped = true;
	}
	
	public void resume() {
		suspended = false;
	}
}


public class ThreadExam08 {

	public static void main(String[] args) {
		
		ThreadEx_08 r1 = new ThreadEx_08();
		ThreadEx_08 r2 = new ThreadEx_08();
		ThreadEx_08 r3 = new ThreadEx_08();
		
		Thread t1 = new Thread(r1,"*");
		Thread t2 = new Thread(r2,"**");
		Thread t3 = new Thread(r3,"***");
		
		t1.start();
		t2.start();
		t3.start();

		try {
			Thread.sleep(2000);		// main thread가 자요!
			r1.suspend();			// Thread t1을 일시중지
			Thread.sleep(2000);		// main thread가 자요!
			r2.suspend();			// Thread t2을 일시중지
			Thread.sleep(3000);		// main thread가 자요!
			r1.resume();			// Thread t1을 다시 동작
			Thread.sleep(3000);		// main thread가 자요!
			r1.stop();				 
			r2.stop();				 
			Thread.sleep(2000);
			r3.stop();
			
		} catch (Exception e) {
			
		}
	
	}

}

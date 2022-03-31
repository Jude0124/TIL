package sample;


public class ThreadExam03 {
	
	public static void main(String[] args) {
		

		
		ThreadEx_03 t1 = new ThreadEx_03("Thread-0번"); // Thread 객체를 생성
		ThreadEx_03 t2 = new ThreadEx_03("Thread-1번");
//		t1.run();	// Thread를 실행시키는게 아니에요! 이건 단지 객체가 가지는
					// method를 호출하는 거에요!
					// Thread는 이렇게 실행시키지 않아요
		
		t1.setPriority(1);
		t2.setPriority(9);
		
		t1.start();	// Thread를 실행시키는 method
		t2.start();	// Thread를 실행시키는 method

	}
}

class ThreadEx_03 extends Thread {
	
	public ThreadEx_03(String name) {
		this.setName(name);
	}
	
	@Override
	public void run() {
		for(int i=0; i<10 ; i++) {
			System.out.println(getName());
//			getName() => Thread의 이름을 가져와요!
		}
	}
}


 
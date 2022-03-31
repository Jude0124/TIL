package sample;


public class ThreadExam02 {
	
	public static void main(String[] args) {
		

		
		ThreadEx_02 t1 = new ThreadEx_02("Thread-0번"); // Thread 객체를 생성
		
//		t1.run();	// Thread를 실행시키는게 아니에요! 이건 단지 객체가 가지는
					// method를 호출하는 거에요!
					// Thread는 이렇게 실행시키지 않아요
//		t1.start();	// Thread를 실행시키는 method

	}
}

class ThreadEx_02 extends Thread {
	
	public ThreadEx_02(String name) {
		this.setName(name);
	}
	
	@Override
	public void run() {
		for(int i=0; i<5 ; i++) {
			System.out.println(getName());
//			getName() => Thread의 이름을 가져와요!
		}
	}
}


 
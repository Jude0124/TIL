package mc.ys.lesson6;

public class ThreadTest {
	public static void main(String[] args) {
		ThreadTest tt = new ThreadTest();
		tt.test1();
	}
	private void test2() {
		// TODO Auto-generated method stub
		// Runnable 객체를 이용한 스레드의 실행 코드 작성
		// Runnable을 구현한 클래스를 만들고
		// 객체로 생성하여 Thread와 연결하세요
	}
	private void test1() {
		Thread t1 = new Thread1();
		Thread t2 = new Thread2();
		
		t1.start();
		t2.start();
	}
}

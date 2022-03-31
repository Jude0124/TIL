package mc.ys.lesson6;

public class RunnableTest {

	public static void main(String[] args) {
		RunnableTest rt = new RunnableTest();
		rt.test1();
	}

	private void test1() {
		Runnable r1 = new Runnable1();
		Runnable r2 = new Runnable2();
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		
		t1.start();	
		t2.start();
	}

}

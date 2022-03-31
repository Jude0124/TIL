package mc.ys.lesson6;

import java.util.Random;

public class Thread1 extends Thread  {
	
	@Override
	public void run() {
		
		for (int i = 0 ; i <100 ; i++) {
			try {
			Thread.sleep(new Random().nextInt(1000)+1);
			System.out.println(i);
			}catch(InterruptedException ie) {
				ie.printStackTrace();
			}
		}
	}

	
}

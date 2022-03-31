package mc.ys.lesson6;

import java.util.Random;

public class Runnable2 implements Runnable {

	@Override
	public void run() {
		for (int i = 65 ; i <65+26 ; i++) {
			try {
				Thread.sleep(new Random().nextInt(1000)+1);
				System.out.println((char)i);
				}catch(InterruptedException ie) {
					ie.printStackTrace();
				}

		}
	}
	
}

package mc.ys.lesson5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class LottoMachine {
	ArrayList<LottoBall> balls;

	LottoMachine(ArrayList<LottoBall> balls) {
		this.balls = balls;
	}

	void startMachine() {
		System.out.println("로또 번호를 뽑습니다.");
		Integer[] choiceBalls = new Integer[6];
		int count = 0;
		while (true) {
			LottoBall ball = this.getBall();

			choiceBalls[count] = ball.getBallNumber();
			count++;
			System.out.printf("뽑힌 공은 %d번입니다. %n", ball.getBallNumber());
			
			if (count == 6) {
				break;
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(Arrays.toString(choiceBalls));

	}

	void shuffle(LottoBall[] balls) {

	}

	LottoBall getBall() {
		LottoBall ball = null;
		Random r = new Random();
		int idx = r.nextInt(balls.size());
		ball = balls.remove(idx);
//		System.out.println(Arrays.toString(balls));

		return ball;
	}
}

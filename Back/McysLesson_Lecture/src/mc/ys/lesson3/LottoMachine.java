package mc.ys.lesson3;

import java.util.Arrays;
import java.util.Random;

public class LottoMachine {
	LottoBall[] balls;

	LottoMachine(LottoBall[] balls) {
		this.balls = balls;
	}

	void startMachine() {
		System.out.println("로또 번호를 뽑습니다.");
		Integer[] choiceBalls = new Integer[6];
		int count = 0;
		while (true) {
			LottoBall ball = this.getBall();
			if (ball != null) {
				choiceBalls[count] = ball.getBallNumber();
				count++;
			} else {
				// 중복
//				System.out.printf("중복된 볼 %d %n",ball.getBallNumber());
			}
//			System.out.printf("뽑힌 공은 %d번입니다. %n", ball.getBallNumber());
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
		int idx = r.nextInt(45);
		ball = balls[idx];
//		System.out.println(Arrays.toString(balls));
		if (!ball.getSelected()) {
			System.out.println("로또볼을 하나 선택했습니다.");
			ball.setSelected(true);
		} else {
			System.out.printf("중복된 볼 %d %n", ball.getBallNumber());
			ball = null;
		}
		return ball;
	}
}

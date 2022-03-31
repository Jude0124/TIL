package mc.ys.lesson3;

public class LottoMachine_Raw {
	LottoBall[] balls;

	LottoMachine_Raw(LottoBall[] balls) {
		this.balls = balls;
	}

	void startMachine() {
		System.out.println("로또 번호를 뽑습니다.");
		Integer[] choiceBalls = new Integer[6];
		for (int i = 0; i < 6; i++) {
			LottoBall ball = this.getBall();
			choiceBalls[i] = ball.getBallNumber();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	LottoBall getBall() {
		LottoBall ball = null;
		System.out.println("로또볼을 하나 선택했습니다.");
		return ball;
	}
}

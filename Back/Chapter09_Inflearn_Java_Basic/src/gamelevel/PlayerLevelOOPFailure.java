package gamelevel;

public class PlayerLevelOOPFailure {
	int level;
	public void run() {
		if (level == 1) {
			System.out.println("천천히 달립니다.");
		}
		else if (level == 2) {
			System.out.println("빨리 달립니다.");
		}
		else if (level == 3) {
			System.out.println("겁나게 빨리 달립니다.");
		}
	}
	public void jump() {
		if (level == 1) {
			System.out.println("jump 할줄 모르지롱~");
		}
		else if (level == 2) {
			System.out.println("높이 jump 합니다.");
		}
		else if (level == 3) {
			System.out.println("겁나게 높이 jump 합니다.");
		}
	}
	public void turn() {
		if (level == 1) {
			System.out.println("turn 할줄 모르지롱~");
		}
		else if (level == 2) {
			System.out.println("turn 할줄 모르지롱~");
		}
		else if (level == 3) {
			System.out.println("한바퀴 돕니다.");
		}
	}
	public void showLevelMessage() {
		if (level == 1) {
			System.out.println("*****초급자 레벨입니다*****");		}
		else if (level == 2) {
			System.out.println("*****중급자 레벨입니다*****");		}
		else if (level == 3) {
			System.out.println("*****고급 레벨입니다*****");		}
	}
	
	final public void go(int count) {
		run();
		for (int i = 0 ; i < count ; i++) {
			jump();
		}
		turn();
	}

}

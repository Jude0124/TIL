package gamelevel;

public class BeginnerLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("천천히 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("jump 할줄 모르지롱~");
	}

	@Override
	public void turn() {
		System.out.println("turn 할줄 모르지롱~");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("*****초보자 레벨입니다*****");
	}

}

package mc.ys.lesson3;

public class Studio_Raw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Studio_Raw studio = new Studio_Raw();
		studio.onAir();
	}
	
	public void onAir() {
		LottoMachine_Raw machine = this.readyLottoMachine();
		System.out.println("지금부터 로또 추첨을 시작합니다.");
		machine.startMachine();
		System.out.println("지금까지 로또 추첨이었습니다.\n감사합니다.");
	}
	
	public LottoMachine_Raw readyLottoMachine() {
		LottoMachine_Raw machine = null;
		machine = new LottoMachine_Raw(null);
		LottoBall ball = new LottoBall(1);
		int number = ball.getBallNumber();
		
		return machine;		
	}

}

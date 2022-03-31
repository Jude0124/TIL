package mc.ys.lesson3;

public class Studio {

	public static void main(String[] args) {
		Studio studio = new Studio();
		
		studio.onAir();
	
	}
	
	public void onAir() {
		LottoMachine machine = this.readyLottoMachine();
		System.out.println("지금부터 로또 추첨을 시작합니다.");
		machine.startMachine();
		System.out.println("지금까지 로또 추첨이었습니다.\n감사합니다.");
	}
	
	public LottoMachine  readyLottoMachine() {
		LottoMachine machine = null;
//		LottoBall ball = new LottoBall(1);
//		ball.setSelected(true);
//		int number = ball.getBallNumber();
//		System.out.println("===============================");
//		System.out.println("로또 공을 생성합니다.");
//		System.out.println("로또 공을 머신에 주입합니다.");
//		System.out.println(ball);
//		System.out.println("===============================");
		machine = new LottoMachine(this.makeBall());
		return machine;
	}
	
	public LottoBall[] makeBall() {
		LottoBall[] balls = new LottoBall[45];
		for(int i = 0 ; i < 45 ; i++) {
			balls[i] = new LottoBall(i+1);
		}
		return balls;
	}
}

package mc.ys.lesson5;

public class LottoBall {
	private int ballNumber;
	private boolean selected;
	public LottoBall(int ballNumber){
		this.ballNumber = ballNumber;
	}
	
	public int getBallNumber() {
		return ballNumber;
	}
		
//	private void setBallNumber(int ballNumber) {
//		this.ballNumber = ballNumber;
//	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "나의 번호는 "+this.ballNumber+"입니다.";
	}
	
}

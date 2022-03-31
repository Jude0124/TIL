package mc.ys.lesson3;

public class LottoBall {
	private int ballNumber;
	private boolean selected;
	public LottoBall(int ballNumber){
		this.ballNumber = ballNumber;
	}
	
	public int getBallNumber() {
		return ballNumber;
	}
	
	public boolean getSelected() {
		return this.selected;
	}
	
	private void setBallNumber(int ballNumber) {
		this.ballNumber = ballNumber;
	}
	
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String status = this.selected?"선택":"미선택";
		return "나의 번호는 "+this.ballNumber+"이고 현재 "+status+"된 상태입니다.";
	}
	
}

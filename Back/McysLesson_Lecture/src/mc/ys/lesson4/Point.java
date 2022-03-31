package mc.ys.lesson4;

public class Point {
	protected int x;
	protected int y;
	
	//생성자 코드 작성(x,y값을 외부로 부터 받아 초기화)
	public Point(int x,  int y) {
		this.x = x;
		this.y = y;
		
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	@Override
	public String toString() {
		return String.format("%3d %3d",x,y);
	}
}

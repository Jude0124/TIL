package abstractex;

public abstract class Computer {
	
	public abstract void display();
	public abstract void typing();
	
//	public abstract int add(int x, int y);
	
	
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
	//메서드를 중괄호로 열고 닫으면 그곳을 구현부라고 부른다. body가 있다고 부를 수있다.
	//아무것도 안쓰고 중괄호를 열고 닫았을지라도 구현부는 있는것, 구현 코드가 없을 뿐이다.
	//;세미콜론으로 닫는 것은 구현부를 작성하지 않겠다는 의미이다. abstract 메서드임을 의미
}

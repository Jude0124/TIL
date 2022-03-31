package sample01;

// 자바형식 코드
public class MTest {

	public static void main(String[] args) {
		// 객체를 생성한 다음 생성된 객체의 주소로 메소드를 호출하는 방식
		// 1. 기본 생성자 객체 생성
		MessageBean mi = new MessageImpl();
		mi.sayHello();
		// 2. 매개 인자 전달 생성자로 객체 생성
		MessageBean mi02 = new MessageImpl("Prune", 7000);
		mi02.sayHello();
	}

}

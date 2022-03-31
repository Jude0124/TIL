package mc.ys.lesson1;

public class Hello {

	public static void main(String[] args) {
//		 TODO Auto-generated method stub
//		System.out.print("Welcome Java");
//		System.out.println("Welcome Java");
//		System.out.println(3+5);
//		System.out.print("3+5");
//		System.out.print(5+3);
//		System.out.println(5+3);
//		System.out.println(5-3);
//		System.out.println(5*3);
//		System.out.println(5/3);
		int x = 10;
		int y = 5;
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		System.out.println(x % y); // 나머지
		// int x = 100; //정수 (integer)를 저장할 변수의 타입은 int로 한다.
		// double pi = 3.14; //실수를 저장할 변수의 타입은 double로 한다.
		// char ch = 'a'; //문자(1개)를 저장할 변수의 타입은 char로 한다.
		// String str = "abc"; //여러 문자(0~n개)를 저장할 변수의 타입은 String으로 한다.
//		
//		System.out.println(x);
//		System.out.println(pi);
//		System.out.println(ch);
//		System.out.println(str);
//		
		// 상수와 리터럴 교재 51페이지
		final int MAX_SPEED = 10;
		final int MAX_VALUE;
		MAX_VALUE = 100;
		// MAX_VALUE = 200;
		System.out.println(MAX_VALUE);
		System.out.println(MAX_SPEED);
		// 2진수를 자바상에서 바로 표현하는 방법은 없음, 그대신 toBinaryString() static 메소드를 통해 해결가능
		int num = 0B11;
		int octNum = 010; // 8진수 10, 10진수로 8
		int hexNum = 0x10; // 16진수 10, 10진수로 16

		System.out.println(octNum);
		System.out.println(hexNum);

		long big = 100_000_000_000L; // long big = 100000000000L;
		long hex = 0xFFFF_FFFF_FFFF_FFFFL; // long hex = 0xFFFFFFFFFFFFFFFFL;

		float pi = 3.14f;
		double rate = 1.618d; // 생략이 가능한점 double과 float 모두 실수형이다!!!double은 생략가능하니까 double을 더 많이 쓸거같음
		// float 과 double의 차이는 없을까???
		System.out.println(num);

	}

}

package interfaceex;

public interface Calc { // 타입상속 이란 구현코드가 없는 인터페이스를 추상클래스나 클래스가 상속받는것을 말한다.(implements)
						// 추상클래스나 클래스를 다른 클래스가 상속 받는것은 구현상속이다.(extends)
	double PI = 3.14;
	int ERROR = -999999999;
	
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
}

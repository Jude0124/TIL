package com.exam;

@FunctionalInterface
interface DoInterface {
	void doSomething();
}

public class Ex01 {
	private int classField = 0;
	private static int staticField = 0;
	
	private void Process() {
		System.out.println("Before; classField =" + classField);
		System.out.println("Before; staticField =" + staticField);
		DoInterface test  = () ->  {
			classField++; // <- 이 변수를 처리할 수 있습니다.
			staticField++; // <-이변수를 처리할 수 있습니다.
		};
		test.doSomething(); //처리를 실행
		System.out.println("After; classField =" + classField);
		System.out.println("After; staticField =" + staticField);
	}
	
	public static void main(String[] args) {
		for (int i = 0; i <= 3; i++) {
			new Ex01().Process();
		}
	}//end Main
}//end Class

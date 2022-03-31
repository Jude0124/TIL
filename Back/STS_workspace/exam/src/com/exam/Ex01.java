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
			classField++; // <- �� ������ ó���� �� �ֽ��ϴ�.
			staticField++; // <-�̺����� ó���� �� �ֽ��ϴ�.
		};
		test.doSomething(); //ó���� ����
		System.out.println("After; classField =" + classField);
		System.out.println("After; staticField =" + staticField);
	}
	
	public static void main(String[] args) {
		for (int i = 0; i <= 3; i++) {
			new Ex01().Process();
		}
	}//end Main
}//end Class

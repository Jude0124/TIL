package mc.ys.lesson1;

public class OpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 프로그램 = 데이터 + 프로세스(동작)
		// 연산자 --> +, - , * , /, %
		/*
		 * int a = 10; float b = 3f; System.out.println(a+b); System.out.println(a-b);
		 * System.out.println(a/b); System.out.println(a*b); System.out.println(a%b);
		 */
		int number = 123456;
		// 위의 number를 한자리씩 분리하여 출력하시오
		// 뒤에서 부터 분리하시오
		// 6
		int splitNumber = number % 10;

		for (int i = 0; i < 6; i++) {
			System.out.println(splitNumber);
			// 5
			number = number / 10;
			// System.out.println(number);

			splitNumber = number % 10;
		}

		/*
		 * System.out.println(splitNumber); //4 number = number / 10;
		 * //System.out.println(number);
		 * 
		 * splitNumber = number % 10; System.out.println(splitNumber); //3 number =
		 * number / 10; //System.out.println(number);
		 * 
		 * splitNumber = number % 10; System.out.println(splitNumber); //2 number =
		 * number / 10; //System.out.println(number);
		 * 
		 * splitNumber = number % 10; System.out.println(splitNumber); //1 number =
		 * number / 10; //System.out.println(number);
		 * 
		 * splitNumber = number % 10; System.out.println(splitNumber);
		 */

	}

	public void test1() {
		/*
		 * int num1 = 10; int num2 = 20; // [ 10 X 20 = 200 ]
		 * System.out.println(num1+" X "+num2+" = "+(num1*num2));
		 * System.out.printf("[%d X %d = %d]",num1,num2,num1*num2);
		 */
		System.out.println("1" + "2");
		System.out.println(true + "");
		System.out.println((int) 'B');
		System.out.println('1' + 2);
		System.out.println('1' + '2');
		System.out.println('J' + "ava");
		System.out.println(true);

	}

}

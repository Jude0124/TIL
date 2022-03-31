package mc.ys.lesson1;

public class OpTest_Pro {
	
	public static void main(String[] args) {
		// 프로그램 = 데이터 + 프로세스(동작)
		// 연산자 --> +, - , *, /, %
//		int a = 10;
//		int b = 3;
//		System.out.println(a+b);
//		System.out.println(a-b);
//		System.out.println(a/b);
//		System.out.println(a*b);
//		System.out.println(a%b);
//		System.out.println(Math.pow(a, b));
		
		
		// 위의 number를 한자리씩 분리하여 출력하시오
		// 뒤에서 부터 분리하시오
		 
//		
//		System.out.println(number%10);
//		
//		
//		System.out.println(number%100/10);
//		
//		System.out.println(number%1000/100);
//		System.out.println(number%10000/1000);
//		System.out.println(number%100000/10000);
//		System.out.println(number%1000000/100000);
		
		int number = 598745;
		int splitNumber = number % 10;
		
		System.out.println(splitNumber);
		
				
		number = number / 10;
		
		splitNumber = number % 10;
		
		System.out.println(splitNumber);
		
		number = number+ 10;
		
		splitNumber = number % 10;
		System.out.println(splitNumber);
		
		number = number / 10 ;
		splitNumber = number % 10;
		System.out.println(splitNumber);
		
		number = number / 10 ;
		splitNumber = number % 10;
		System.out.println(splitNumber);
		
		
		
		
		number = number /10 ;
		splitNumber = number % 10;
		System.out.println(splitNumber);
		
		
		int num1 = 10;
		int num2 = 20;
		// [10 X 20 = 200]
		System.out.println(num1+" X "+num2+" = "+(num1*num2));
		System.out.printf("%d X %d = %d",num1,num2,num1*num2);

		
//		System.out.println
		
		
		// 문자열 크기 순서 b -> s ->i-> l -> f -> d
		// Char는 왜 문자열 크기 순서에 2비트인 short와 같이 비교하지 않나요?
		// Char 은 서수이고 나머지는 기수임. 서수 : 순서를 나타내는 수 
		// 기수 : 숫자 자체에 순서의 의미가 없고 양을 나타내는 수
		
		
		
		//이스케이프 문자열 복붙할 수 있도록 설정 변환하는 방법
		//Window -> Preferences -> Java -> Editor -> Typing 에서
		//Escape text when pasting into a string literal 설정을 해제 해 주면 됩니다.

		
		
	}

}

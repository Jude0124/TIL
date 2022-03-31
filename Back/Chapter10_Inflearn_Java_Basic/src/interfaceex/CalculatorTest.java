package interfaceex;

public class CalculatorTest {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 2;
		
		Calc calc = new CompleteCalc();
		Calculator calc2 = new CompleteCalc();
		
		System.out.println(calc.add(num1, num2));
		// calc. 을 찍어서 찾아봐도 타입이 인터페이스이기때문에 CompleteCalc에 있는 메서드에 접근할 수 없다.
		
	}

}

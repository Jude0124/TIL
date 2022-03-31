package mc.ys.Exercise1;

import java.util.Scanner;

public class ExchangeTwoValue {

	public static void main(String[] args) {
		ExchangeTwoValue etv = new ExchangeTwoValue();
		Scanner sc = new Scanner(System.in);
		System.out.println("교환하고자 하는 두 값(정수)을 차례로 입력해주세요");
		System.out.println("첫번째 값");
		int value1 = sc.nextInt();
		
		System.out.println("두번째 값");
		int value2 = sc.nextInt();
		
		sc.close();
		etv.change(value1,value2);
	}
	
	public void change(int value1,int value2){
		int temp = value1;
		value1 = value2;
		value2 = temp;
		System.out.printf("두 값의 위치가 변경되었습니다.첫번째 값 : %d, 두번째 값 : %d",value1,value2);
	}
}

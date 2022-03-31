package mc.ys.lesson1;

import java.util.Iterator;

public class TwoxTwo {
	public static void main(String[] args) {
		
		System.out.println("2단");
		
		for(int i = 1 ; i < 10 ; i++) {
	
		System.out.println("2 x " + i + " = " + i*2);
		
		
		
		}
		
		int number  = 1 ;
		for (int i = 0 ; i < 9 ;  i ++) {
			//System.out.println("2X"+number+"="+(number*2));
			//printf버전으로 바꾸시오
			System.out.printf("2X%d=%d %n",number, number*2);
			//number를 1증가시킵니다.
			number = number + 1 ;
			//1을 증가시키는 다른 코드를 작성하시오.
			//number++;
			//number += 1;
		}
		
	}
	
}
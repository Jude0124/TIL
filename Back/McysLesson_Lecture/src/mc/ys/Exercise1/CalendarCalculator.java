package mc.ys.Exercise1;

import java.util.Calendar;

public class CalendarCalculator {
	
	public void clac(int year, int month) {

		
	 // static은 정적 변수라는 의미로 이미 고정박아놓고 사용하는 값들을 말한다.
									// 이미 고정이 되어있기 때문에 붕어빵 틀로 찍어내듯이 복제를 하기보다는 그냥 고정된 값을 사용하는것이다.
		
		Calendar cl = Calendar.getInstance();
		
		cl.set(year, month - 1, 1);

		int space = cl.get(Calendar.DAY_OF_WEEK) - 1; 
		

		
		
		int lastday = cl.getActualMaximum(cl.DAY_OF_WEEK_IN_MONTH);
 
		System.out.println("========================================================");
		System.out.printf("%d년 %d월\t\t\t\t\t\t|\n", year, month);
		System.out.println("========================================================");
		System.out.println("일\t월\t화\t수\t목\t금\t토\t|");

		for (int i = 0; i < space; i++) {
			System.out.print("\t");
		}
		for (int j = 1; j < lastday + 1; j++) {
			System.out.print(j + "\t");
			if ((space + j) % 7 == 0) {
				System.out.println("|");
			}
		}
		for (int k = 0; k < 7 - (lastday + space) % 7; k++) {
			System.out.print("\t");
		}
		System.out.println("|");
		System.out.println("========================================================");

	}
}

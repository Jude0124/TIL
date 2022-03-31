package mc.ys.lesson1;

public class BasicClass {

	public static void main(String[] args) {
		/*
		 * 년도를 400으로 나누면 나누어 떨어진다.
		 * 년도를 4로 나누어 떨어지는 동시에 100으로 나누어 떨어지지 않는다.
		 */
		/*
		int year = 2020;
		if (year%400 == 0 || ((year % 4== 0) && ( year % 100 != 0) )) {
			System.out.println(year+"는 윤년입니다. ");
		}
		*/
		
		for ( int year = 2020;year<2025;year++) {
			if (year%400 == 0 || ((year % 4== 0) && ( year % 100 != 0) )) {
				System.out.println(year+"는 윤년입니다. ");
			}
			else {
				System.out.println(year+"는 윤년이 아닙니다.");
			}
						
		}
	}

}

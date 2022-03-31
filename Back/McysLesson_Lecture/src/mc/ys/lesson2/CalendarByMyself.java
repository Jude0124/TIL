package mc.ys.lesson2;

import java.util.Scanner;

public class CalendarByMyself {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int year = scan.nextInt(); // 2020 

		System.out.println("=================");

		int month = scan.nextInt(); // 2020년 2월 -> 2019년 전부 + 2019년 1월

		System.out.println("=================");

		//int day = scan.nextInt();
		
		// 해당 월의 공백은 우선 전년도 까지의 모든 일수를 더한뒤, 해당월의 전월까지 모든 일수를 더해준다.
		
		// 해당 년도가 400으로 나누어떨어지것의 개수 +나 (!100으로 나누어 떨어지지  해의 개수 && 4로나누어떨지는해의 개수) 윤년 윤월 2  윤일 29
		int space = (year-1)*365 + year/4 - year/100+ year/400 ; //알고리즘
		//2019
		// 1월 = 31 2월 = 28(29) 3월 = 31 4월 = 30 5월 = 31 6월 = 30
		int[] box = {31,28,31,30,31,30,31,31,30,31,30,31};
	
		for(int j = 0; j < month-1; j++) {
			
			space += box[j];
			
		}
		
		if(year%400 ==0 || (year%4==0&&year%100!=0)) {
			if (2<month) {
				space += 1;
			}
		}
		
		space %= 7;
		
		System.out.println("\n" + "===================================================");
		System.out.println(year + "년 " + month + "월");
		System.out.println("===================================================");
		System.out.println("월\t화\t수\t목\t금\t토\t일");

		int day = 32;

		if (month == 2) {
			day = 29;
			if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
				day = 30;
			}

		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			day = 31;
		}

		

		for (int ph = 0; ph < space; ph++) {
			System.out.print("\t");
		}

		for (int j = 1; j < day; j++) {
			System.out.print(j + "\t");

			if ((j + space) % 7 == 0) {
				System.out.print("\n");
			}
		}
		System.out.println("\n" + "===================================================" + "\n");

		space = (space + (day - 1)) % 7;

	}

}

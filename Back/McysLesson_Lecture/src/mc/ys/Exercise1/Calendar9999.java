package mc.ys.Exercise1;

import java.util.Scanner;

public class Calendar9999 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int year = 0, month = 0;
		
		while (true) {
			try {
				
				System.out.println("원하시는 달력의 년도를 입력해주세요");
				String rawYear = sc.nextLine();
				year = Integer.parseInt(rawYear);
				break;
				
			} catch (NumberFormatException nfe) {
				System.out.println("잘못된 형식입니다. 다시입력해주세요");
				sc = new Scanner(System.in);
			}
		}
		
		
		while (true) {
			try {
				
				System.out.println("원하시는 달력의 월를 입력해주세요");
				String rawMonth = sc.nextLine();
				month = Integer.parseInt(rawMonth);
				if (month <1 || month > 12) {
					System.out.println("잘못된 형식입니다. 다시 입력해주세요.");
					continue;
				}
				break;
				
			} catch (NumberFormatException nfe) {
				System.out.println("잘못된 형식입니다. 다시 입력해주세요.");
				sc = new Scanner(System.in);
			}
		}
		
		CalendarCalculator cal = new CalendarCalculator();
		
		cal.clac(year,month);
	}
	
	
	
	
}

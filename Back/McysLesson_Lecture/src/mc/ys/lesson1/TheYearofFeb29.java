package mc.ys.lesson1;

public class TheYearofFeb29 {

	public static void main(String[] args) {
		
		int Year = 2020;
		
		if (Year%4 == 0) {
			if(Year%100 != 0) {
				System.out.printf("%d년은 윤년입니다.",Year);
			}
			else {
				System.out.printf("%d년은 윤년이 아닙니다.",Year);
			}
		}
		
	}

}

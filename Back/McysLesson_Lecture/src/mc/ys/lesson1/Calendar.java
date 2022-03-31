package mc.ys.lesson1;

public class Calendar {

	public static void main(String[] args) {

		int year = 2020, month = 2, preyear = year - 1, space; // 현재연도, 월, 해당 월의 마지막 일자, 전년도, 달력의 빈칸
		int[] lastDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		space = preyear * 365 + preyear / 400 + preyear / 4 - preyear / 100; // 전년도까지 모든 일수를 합해준다 (윤년 포함)

		for (int i = 0; i < month - 1; i++) { // 전월까지 올해의 모든 일수를 합해준다

			space += lastDays[i];
		}

		if (month > 2) {
			if ((year % 400 == 0) || (year % 100 != 0 && year % 4 == 0)) {
				space += 1; // 올해가 윤년이고 이미 지난경우 올해 윤일을 1 더해준다
			}
		}
		space %= 7; // 이번달 기준으로 1년 1월 1일부터 모든 일수를 더한 값을 7로 나누어 이번달 1일이 몇요일부터 시작해야하는지 (공백 값)를 구한다.

		System.out.printf("%d년\t%d월\n", year, month);
		System.out.println("월\t화\t수\t목\t금\t토\t일");

		for (int j = 0; j < space; j++) {
			System.out.print("\t");
		}
		for (int k = 1; k < lastDays[month - 1] + 1; k++) {
			System.out.printf("%d\t", k);
			if ((space + k) % 7 == 0) {
				System.out.println();
			}
		}
	}

}

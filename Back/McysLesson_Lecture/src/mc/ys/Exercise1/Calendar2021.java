package mc.ys.Exercise1;

import java.util.Scanner;

public class Calendar2021 {

	public static void main(String[] args) {
		System.out.println("2021년의 달력입니다.");
		System.out.println("원하시는 달을 입력해주세요");

		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt() - 12;

		if (0 <= month && month < 12) {
			int[] Month = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

			System.out.println("========================================================");
			System.out.println("2021년 8월\t\t\t\t\t\t|");
			System.out.println("========================================================");
			System.out.println("일\t월\t화\t수\t목\t금\t토\t|");
			for (int i = 0; i < Month[month]; i++) {
				System.out.print((i + 1) + "\t");
				if (i % 7 == 6) {
					System.out.println("|");
				}

			}
			System.out.println("\t\t\t\t|");
			System.out.println("========================================================");

		}
		else {
			System.out.println("잘못된 값을 입력하셨습니다.");
			}
	}
}

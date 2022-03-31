package mc.ys.Exercise1;

import java.util.Scanner;

public class NumberSeperator {

	public static void main(String[] args) {

		NumberSeperator ns = new NumberSeperator();
		Scanner sc = new Scanner(System.in);

		System.out.println("분리하여 출력하고자 하는 숫자를 입력해주세요.");

		int num = 0;
		try {
			num = sc.nextInt();
		} catch (NumberFormatException nfe) {
			System.out.println("올바른 숫자가 아닙니다.");

		}

		ns.Seperator(num);

	}

	public void Seperator(int num) {
		System.out.println("입력받은 숫자를 1의자리부터 차례로 분리하여 출력합니다.\n");
		if (num == 0) {
			System.out.println(num);
		}
		
		while (num != 0) {
			int tempnum = num % 10;
			System.out.println(tempnum);
			System.out.println("==================");
			num /= 10;
			
		}
	}

}

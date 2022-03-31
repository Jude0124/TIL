package mc.ys.lesson1;

public class CodeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2~9단까지 출력하는 코드로 수정하시오
		int dan = 1;
		for (int k = 0; k < 9; k++) {
			int number = 2;
			for (int i = 0; i < 8; i++) {
				System.out.printf(number + "X%d=%2d ", dan, number * dan);
				// number를 1증가시킵니다.
				number = number + 1;

			}
			System.out.println();
			dan = dan + 1;
		}

	}

	public void test() {
		int dan = 2;
		for (int k = 0; k < 8; k++) {

			int number = 1;
			for (int i = 0; i < 9; i++) {
				System.out.printf(dan + "X%d=%d %n", number, number * dan);
				// number를 1증가시킵니다.
				number = number + 1;
			}
			dan = dan + 1;
		}
	}

}

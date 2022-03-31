package mc.ys.lesson1;

public class Review1228 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2단출력을 하드코딩하시오 (리팩토링: 코드 개선작업)
		// 9번 반복하는 for문 작성하시오
		int number = 1;
		for (int i = 0; i < 9; i++) {
			// System.out.println("2X"+number+"="+(number*2));
			// printf버전으로 바꾸시오
			System.out.printf("2X%d=%d %n", number, number * 2);
			// number를 1증가시킵니다.
			number = number + 1;
			// 1을 증가시키는 다른 코드 작성하시오
			// number++;
			// number += 1;
		}

	}

}

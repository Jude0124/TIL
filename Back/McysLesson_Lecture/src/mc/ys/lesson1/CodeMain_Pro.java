package mc.ys.lesson1;

public class CodeMain_Pro {

	public static void main(String[] args) {

		// 2~9단까지 출력하는 코드로 수정하시오
//
//		for (int i = 2; i < 10; i++) {
//
//			System.out.println(i + "단 \n");
//
//			for (int j = 1; j < 10; j++) {
//
//				System.out.printf("%d X %d = %d %n", i, j, i * j);
//
//			}
//			System.out.println();
//		}

		// 강사님 코드
		int dan = 1;
		for (int k = 0; k < 9; k++) {
			
			int number = 2;
			
			for (int i = 0; i < 8; i++) {
				System.out.printf("%d X %d = %2d \t",number,  dan, dan * number);
				// number를 1증가시킵니다.
				number++; // number = number + 1
			
			}
			System.out.println();
			dan++; // dan = dan +1
			
			
		}
		
		}

	}



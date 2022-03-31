package mc.ys.lesson3;

import java.util.Random;

public class CodeOOP {

	public static void main(String[] args) {

		CodeOOP co = new CodeOOP();
		co.test();

//		Random r = new Random();
	}

	public void test() {
		System.out.println("test");
		Random r = new Random();
		// 1~45까지의 수 6개를 생성하는 코드를 작성하시오.
		for (int k = 0; k < 10; k++) {
			for (int i = 0; i < 6; i++) {
				int rnd = r.nextInt(45) + 1; // 0<=rnd<45
				System.out.printf("%2d ", rnd);
			}
			System.out.println();
		}
	}
}
package mc.ys.lesson9;

import java.util.Arrays;
import java.util.Scanner;

public class Review9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Review9 r9 = new Review9();
//		r9.sum(1,10);
//		r9.suffle();
		int[] a = { 5, 3, 4, 1, 2 };
		r9.sort(a);
		System.out.println(Arrays.toString(a));
		//배열을 표준입력장치를 통해서 만들 것임.
//		Scanner 클래스를 이용해 표준입력장체서 입력을 받은 것임.
//		인스턴스 생성하세요
		Scanner sc = new Scanner(System.in);
		//입력받아서 배열에 대입할 것임. --> 이미 배열이 만들어져 있어야 함.
		//입력할 갯수를 먼저 결정해서 배열을 생성하고 난 뒤에 입력하겠다.
		//갯수 입력.
		System.out.println("사용할 배열의 크기를 입력하세요 >>>");

	}

	public void sort(int[] numbers) {
		// 선택 정렬
		// int choice = numbers[0];
		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = i + 1; j < numbers.length; j++) {

				if (numbers[i] > numbers[j]) {
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}

	}

	public void suffle() {
		int[] numbers = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		// 위의 numbers배열의 숫자를 섞는 코드를 작성하시오.
		double rannum = Math.random();
		for (int num : numbers) {
			int temp = numbers[num];
			numbers[num] = numbers[(int) (rannum * num)];
			numbers[(int) (rannum * num)] = temp;
		}

		System.out.println(Arrays.toString(numbers));
	}

	// 두수 사이의 수(두수는 포함)에 대해 관계를 구하는 메소드 선언을 하시오.
	public void sum(int n, int m) {
		int total = 0;
		for (int i = n; i < m + 1; i++) { // 0~9까지의 수
			total = total + i; // 누적
		}
		System.out.println(total);
	}

	public void exchange(int n, int m) {
		System.out.println("실행이전");
		System.out.println("n : " + n + "m : " + m);
		int temp = n;
		n = m;
		m = temp;
		System.out.println("실행이후");
		System.out.println("n : " + n + "m : " + m);

	}

}

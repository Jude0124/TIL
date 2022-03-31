package algorismProject1;

import java.util.Scanner;

public class QuickSort {
	public static void main(String[] args) {
		QuickSort qs = new QuickSort();
		int[] students = qs.inputStudent();
		students = qs.sortStudent(students, 0, students.length - 1);
		
		
		System.out.println();
		System.out.println("성적 순으로 정렬");
		for (int i = students.length - 1; i > -1; i--) {
			System.out.printf("%d등 : %d",students.length-i, students[i]);
			System.out.println();
		}
	}

	public int[] inputStudent() {

		Scanner sc = new Scanner(System.in);

		System.out.print("학생 수 입력 :");
		int stnum = 0;
		try {
			String input = sc.nextLine();
			stnum = Integer.parseInt(input);

		} catch (ClassCastException cce) {
			System.out.println("잘못 된 형식입나다.다시 입력해주세요");
			inputStudent();
		}

		if (stnum < 1) {
			System.out.println("최소 1명이상의 학생을 다시 입력해주세요.");
			inputStudent();
		}

		int[] students = new int[stnum];
		for (int i = 0; i < stnum; i++) {
			System.out.printf("학생 %d 점수 입력 : ", i + 1);
			int scoretemp = 0;
			try {
				String input = sc.nextLine();
				scoretemp = Integer.parseInt(input);
				students[i] = scoretemp;
			} catch (ClassCastException cce) {
				System.out.println("잘못 된 형식입니다.다시 입력해주세요");
				i--;
				continue;
			}

			if (scoretemp < 0 || scoretemp > 100) {
				i--;
				System.out.println("잘못 된 형식입니다.다시 입력해주세요");
				continue;
			}

		}
		sc.close();
		return students;
	}

	public int[] sortStudent(int[] students, int left, int right) {

		if (left < right) {

			int newPivot = partition(students, left, right);
			// 기준의 왼쪽 배열들
			sortStudent(students, left, newPivot - 1);
			// 기준의 오른쪽 값들
			sortStudent(students, newPivot + 1, right);

		}

		return students;
	}

	public static void quickSort(int[] ori, int left, int right) {

	}

	public static int partition(int[] arr, int left, int right) {

		int pivot = (left + right) / 2;

		// 작은 거는 pivot의 왼쪽, 큰 거는 오른쪽
		while (left < right) {
			while (left <= right && arr[left] <= arr[pivot])
				++left;
			while (left <= right && arr[right] > arr[pivot])
				--right;

			if (left <= right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				// 오른쪽 검사가 다 끝난 경우는 right=pivot
				// right은 arr[pivot]과 같은 값도 멈추기 때문
				if (right == pivot) {
					// left 와 pivot을 swap 한 경우이므로
					// 기준 점을 left로 수정
					return left;
				}
			}
		}
		// left는 검사가 끝났는데, right는 안 끝난 경우
		// pivot의 기준점을 right으로 바꾸기
		if (right != pivot) {
			int temp = arr[right];
			arr[right] = arr[pivot];
			arr[pivot] = temp;
		}
		return right;

	}
}

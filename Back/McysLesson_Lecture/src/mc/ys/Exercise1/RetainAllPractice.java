package mc.ys.Exercise1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RetainAllPractice {

	public static void main(String[] args) {
		// 비교할 List 준비
		List<Integer> list1 = new ArrayList<>(Arrays.asList(2,2,2,2,2,4,4));
		List<Integer> list2 = new ArrayList<>(Arrays.asList(3,3,3,3,4,4,4));
		// 비교해서 중복값 찾기
		list1.retainAll(list2);
		// 결과 출력
		System.out.println(list1); // [2, 3]
		System.out.println(list2); // [2, 3, 4]

	}
}

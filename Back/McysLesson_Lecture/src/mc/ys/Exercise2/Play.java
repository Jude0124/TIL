package mc.ys.Exercise2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Play {

	public void playGame() {

		int sysNum = this.createNumber();

		System.out.println("4자리 숫자가 생성되었습니다.");

		System.out.println("====================");

		List<String> sysNumber = new ArrayList<String>(), userNumber = new ArrayList<String>();

		String userNum = "0";

		sysNumber = Arrays.asList(String.valueOf(sysNum).split(""));

		Scanner sc = new Scanner(System.in);

		System.out.println("숫자를 입력하여 맞춰주세요.게임을 중단하시려면 Q를 입력하십시오");

		while (sysNum != Integer.parseInt(userNum)) {

			int Strike = 0, Ball = 0;

			userNum = sc.nextLine(); // 사용자 숫자 입력

			if (userNum.equals("Q")) { // 1.종료 메세지 입력시 프로그램 종료
				break;

			} else if (!userNum.matches("[+-]?\\d*(\\.\\d+)?") || (Integer.parseInt(userNum) > 9999)
					|| (Integer.parseInt(userNum) < 1000)) { // 2.형식에 맞지않을시 재 입력 요청
				System.out.println("잘못입력하셨습니다.");
				System.out.println("\n다시 숫자를 입력하여 맞춰주세요.게임을 중단하시려면 Q를 입력하십시오");

			} else if (sysNum == Integer.parseInt(userNum)) { // 3.숫자가 일치할 경우 정답으로 출력
				System.out.println("4 Strike !!!\n>>>정답입니다<<<");

			} else { // 4. 정답은 아닌데 제대로 입력했을시 Strike,Ball 정보 제공
				userNumber = Arrays.asList(userNum.split(""));
				for (int i = 0; i < sysNumber.size(); i++) {
					for (int j = 0; j < userNumber.size(); j++) {
						if (i == j && sysNumber.get(i).equals(userNumber.get(j))) {
							Strike += 1;
						} else if (sysNumber.get(i).equals(userNumber.get(j))) {
							Ball += 1;
						}
					}

				}

				System.out.printf("%d Strike /// %d Ball", Strike, Ball);
				System.out.println("\n다시 숫자를 입력하여 맞춰주세요.게임을 중단하시려면 Q를 입력하십시오");

			}

		}

	}

	public int createNumber() {
		int answer = 0000;
		Random rnd = new Random();

		boolean flag = true;

		while (flag) {

			flag = false; // break;
			List<Integer> box = new ArrayList<Integer>();
			answer = rnd.nextInt(9000) + 1000;

			for (int i = 10; i < 10001; i *= 10) {

				box.add((answer % i) / (i / 10));

				for (int j = 0; j < box.size() - 1; j++) {

					if (answer % i / (i / 10) == box.get(j)) {

						flag = true;

					}
				}
			}

		}
		return answer;
	}

}

package mc.ys.Exercise2;

import java.util.Scanner;

public class Game {

	public void screen() {

		Scanner sc = new Scanner(System.in);

		String userInput = "";

		while (userInput != null && !userInput.equals("1") && !userInput.equals("2")) {

			System.out.println(" 게임을 시작할까요? ");
			System.out.println(" 예 : 1 , 아니오 : 2");

			userInput = sc.nextLine();
		}

		if (userInput.equals("1")) {
			System.out.println("게임을 시작합니다.");
			System.out.println("====================");

			Play mn = new Play();
			mn.playGame();

			System.out.println("게임이 종료되었습니다.");
			
		} else {
			System.out.println("게임이 종료되었습니다.");
		}
		sc.close();
	}


}

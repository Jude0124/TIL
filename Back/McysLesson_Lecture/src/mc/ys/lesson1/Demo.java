package mc.ys.lesson1;

public class Demo {

	public static void main(String[] args) {
		int number = 12345678;
		while (true) {

			int splitnumber = number % 10; // number값을 10으로 나눈 나머지를 int타입 splitnumber에 저장한다.
			System.out.println(splitnumber); // splitnumber값을 띄어쓰기 포함해서 출력한다.
			number = number / 10; // number/10의 값을 number에 저장한다.
			if (number == 0) { // 만약 number값이 0이 되면
				break; // 멈추고 while문을 탈출한다. 여기서 끝
			}

		}

	}

}

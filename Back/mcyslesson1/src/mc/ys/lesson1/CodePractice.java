package mc.ys.lesson1;

public class CodePractice {

	public static void main(String[] args) {
		System.out.println("2021년 8월");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		/*
		 * System.out.println("1\t2\t3\t4\t5\t6\t7");
		 * System.out.println("8\t9\t10\t11\t12\t13\t14");
		 * System.out.println("22\t23\t24\t25\t26\t27\t28");
		 * System.out.println("29\t30\t31");
		 */
		int day = 1;
		for (int i = 0; i < 31; i++) { // i = i + 1;
			System.out.print(day + "\t");
			if (day % 7 == 0) { // day==7||day==14||day==21||day==28
				System.out.println();
			}
			day = day + 1;
		}

	}

}

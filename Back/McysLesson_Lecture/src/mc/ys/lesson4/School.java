package mc.ys.lesson4;

import java.text.DecimalFormat;

public class School {

	public static void main(String[] args) {
		School school = new School();
		school.test1();

	}

	public void test1() {

		String studentKim = "kim,39,49,59";
		String studentLee = "lee, 48,89,64";
		String studentPark = "park,90,81,100";

		String[] scores = { studentKim, studentLee, studentPark };
//		StudentVO[] students = new StudentVO[scores.length];
		System.out.println("name kor eng math total avg");
		System.out.println("==================================");

		for (int i = 0; i < scores.length; i++) {

			String[] temp = scores[i].split(","); // StringTokenizer
			String name = temp[0];
			int kor = 0, eng = 0, math = 0;

			try {
				kor = Integer.parseInt(temp[1].trim());
//				kor = Integer.parseInt(temp[1]);

				eng = Integer.parseInt(temp[2].trim());
				math = Integer.parseInt(temp[3].trim());
			} catch (NumberFormatException nfe) {
				System.out.println(nfe.getMessage());
			}

			StudentVO result = new StudentVO(name, kor, eng, math);
			System.out.println(result);
			
//			int total = result.getKor() + result.getEng() + result.getMath();
//			double avg = (double)total / 3;
//			DecimalFormat Davg = new DecimalFormat("#.##");
//			
//			System.out.printf("total is %d avg is %s %n", total, Davg.format(avg));

		}

	}
}

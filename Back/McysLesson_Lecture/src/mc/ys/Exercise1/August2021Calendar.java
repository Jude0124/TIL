package mc.ys.Exercise1;

public class August2021Calendar {

	public static void main(String[] args) {

		System.out.println("========================================================");
		System.out.println("2021년 8월\t\t\t\t\t\t|");
		System.out.println("========================================================");
		System.out.println("일\t월\t화\t수\t목\t금\t토\t|");
		for (int i = 0; i < 31; i++) {
			System.out.print((i+1) + "\t");
			if (i%7==6) {
				System.out.println("|");
			}
		
		}
		System.out.println("\t\t\t\t|");
		System.out.println("========================================================");

	}

}

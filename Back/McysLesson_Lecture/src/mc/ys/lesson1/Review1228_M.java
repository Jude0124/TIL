package mc.ys.lesson1;

public class Review1228_M {

	public static void main(String[] args) {
		// 2021년 8월 달력을 출력한느 코드 작성
		System.out.println("2021년\t8월");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		for (int i=1;i<32;++i) {
			
			System.out.print(i+"일\t");
			
			if (i%7==0) {
				
				System.out.println();
			}	
		}
	}
}

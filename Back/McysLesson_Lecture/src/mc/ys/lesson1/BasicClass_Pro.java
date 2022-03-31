package mc.ys.lesson1;

public class BasicClass_Pro {

	public static void main(String[] args) {
		/*
		 * break, continue는 반복문을 제어하는 키워드입니다. 이것의 사용법을 샘플
		 * 교재를 보면서 실습해 보세요
		 * 
		 * 
		 * 년도를 400으로 나누면 떨어진다. 
		 * 년도를 4로 나누어 떨어지는 동시에 100으로는 나누어 떨어지면 않는것.
		 */
		 // 2020~2024년까지 윤년여부를 출력하는 코드 작성
		int year = 2020;
		for(int i=0;i<5;i++) {
			if(year%400==0 || (year%4==0&&year%100!=0)) {
				System.out.println(year+"는 윤년입니다. ");
			} else {
				System.out.println(year+"는 평년입니다. ");
			}
			year = year + 1;
		}
		 
	}

}

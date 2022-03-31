package mc.ys.lesson1;

public class PreetyGuGU {
	public static void main(String[] args) {
		/* for (int times = 1 ; times < 10; times ++) {
			for (int dan = 2 ; dan < 10; dan++) {
				String result = Integer.toString(dan*times);
				if(result.length() == 1) {
					result = " "+ result;
				}
				System.out.printf("%d X %d = %s ",dan,times,result);
				
			}
			System.out.println();
		}*/  //내가 짠코드
		
		for (int times = 1 ; times < 10; times ++) {
			for (int dan = 2 ; dan < 10; dan++) {				
				System.out.printf("%d X %d = %2d ",dan,times,dan*times);
			}
			System.out.println(); // 하빈님&강사님이 짜신 코드 _ 포멧팅에 자리수 고정 설정할 수 있음!!
		}
	}
}

package loopexample;

public class ForExample {

	public static void main(String[] args) {
		
		int num;
		int sum;
		
		for(num = 1, sum = 0; num<= 10; num++) {
			sum += num;
		}
		System.out.println(sum);
		System.out.println(num);
	
		int dan;
		int times;
		
		for(dan = 2; dan <= 9; dan++) {
			
			for(times = 1; times <= 9; times++) {
				System.out.println(dan + "X" + times + "=" + dan*times);
			}
			System.out.println("");
		}
		
		dan =2;
		while(dan <= 9) {
			/*if ( (dan % 2) != 0) {
				dan++;
				continue;  //짝수단만 출력하게끔 if 문으로 걸러줌
			}
			*/
			
			times = 1;
			while(times<=9) {
				//if (times > dan) break;
				System.out.println(dan+ "X" + times + "=" + dan*times);
				times++;
			}
			
			dan++;
			System.out.println();
		}
		
	}
	
}



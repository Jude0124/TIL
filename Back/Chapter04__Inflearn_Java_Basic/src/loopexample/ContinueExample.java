package loopexample;

public class ContinueExample {

	public static void main(String[] args) {
		int total = 0;
		int num;
		
		for(num = 1; num <= 100; num++) {
			if(num % 2 == 1) {
				continue;
			}
			total += num;
		}
		System.out.println("1부터 100까지의 짝수의 합은:" + total + "입니다.");
	}

}

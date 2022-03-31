package mc.ys.Exercise1;

import java.util.Arrays;
import java.util.Scanner;

public class GetSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("더하고자 하는 숫자들사이를 ,로 분리하여 입력해주세요");
		String rawString = sc.nextLine();
		sc.close();
		GetSum gs = new GetSum();
		
		System.out.printf("입력하신 숫자들의 합은 %d입니다.", gs.sumof(rawString));
	}
	

	public int sumof(String contents) {
		
		String[] splitString = contents.split(",");
		int sum = 0;
		for (int i = 0; i < splitString.length; i++) {
			try {
				
				sum += Integer.parseInt(splitString[i].trim());
				
			} catch (NumberFormatException nfe) {
				System.out.println(nfe.getMessage()+"은 올바른 숫자형식이 아니어 처리되지않고 연산합니다.");
			}

		}
		return sum;
	}

}

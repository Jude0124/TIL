package mc.ys.Exercise1;

import java.util.Scanner;

public class LeapYearCheck {

	public static void main(String[] args) {
		LeapYearCheck lyc = new LeapYearCheck();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("윤년인지 체크하고자 하는 연도를 입력해주세요");
		
		String RawYear = sc.nextLine();
		
		sc.close();
		
		lyc.check(RawYear);
		

	}
	
	public void check(String rawYear){
		try{
			int year = Integer.parseInt(rawYear);
			
			if (year%400 == 0 || (year%4==0&&year%100!=0)){
				System.out.printf("입력하신 %d년은 윤년입니다.",year);
			}else {
				System.out.printf("입력하신 %d년은 평년입니다.",year);
			}
		}catch(NumberFormatException nfe) {
			System.out.println("올바른 연도가 아닙니다.");
		}
	}
	
	
	
}

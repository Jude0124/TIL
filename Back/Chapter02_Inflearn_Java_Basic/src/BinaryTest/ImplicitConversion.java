package BinaryTest;

public class ImplicitConversion {
	public static void main(String[] args) {
		byte bNum = 10 ;
		int num = bNum ;
		
		System.out.println(num);
		
		long lNum =10;
		float fNum = lNum;
		
		System.out.println(fNum);
		
		double dNum = fNum + num;
		
		System.out.println(dNum);
		
		//적은수에서 큰수로 자연스럽게 정수에서 실수로 형변환은 명시적으로 지정해주지 않아도 묵시적으로 형변환을 해준다
		
	}
}

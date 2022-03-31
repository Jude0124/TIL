package mc.ys.lesson9;

public class DataStructure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataStructure ds = new DataStructure();
		ds.test1();
		
		int[] numbers = {1,2,3,4,5};		
		ds.print(numbers);
	}
	
	public void test1() {
		// 최대값
		// 최소값
		// 합계
		// 배열 - 데이터를 모아서 하나의 변수로 처리하는것
		int[] numbers = null;
		numbers = new int[5];
		
		int[] numbers2 = {1,2,3,4,5,6,7,8,9,0};
		 
		this.print(numbers2);
		
		// number2에 대해서 최솟값 구하는 코드를 작성하시오
		int max = numbers2[0];
		for(int i = 1 ; i < numbers2.length ; i++) {
			if(max<numbers2[i]) {
				max = numbers2[i];
			}
		}
		System.out.println("max is" + max);
		// number2에 대해서 최솟값 구하는 코드를 작성하시오
		int min = numbers2[0];
		for(int i = 1 ; i < numbers2.length ; i++) {
			if(min<numbers2[i]) {
				min = numbers2[i];
			}
		}
		System.out.println("min is" + min);
	}
	
	//배열을 받아서 출력하는 method print를 생성하시오.
	
	public void print(int[] numbers) {
		
		for(int a : numbers) System.out.print(a);
	}
	
}

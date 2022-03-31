package array;

public class ArrayTest {

	public static void main(String[] args) {
				
		int[] numbers = {1,2,3};;

		
//		sameex1
//		int[] numbers = new int[3];
//		
//		
//		numbers[0] = 1;
//		numbers[1] = 2;
//		numbers[2] = 3;
//		
		
//		sameex2
//		int[] numbers;
//		numbers = new int[] {1,2,3};
		
		
		
		for (int i = 0 ;i< numbers.length;  i++) { //<= 2와 의미가 같지만 가독성 때문에 <3을 더 많이 쓴다 갯수를 가독적으로 보기위해서.
			System.out.println(numbers[i]);
		}
		
//		double [] sutdentIDs = new double[5]; 
//		
//		for (int i = 0 ;i <sutdentIDs.length;  i++) {
//			System.out.println(sutdentIDs[i]);
//		}
		
	}

}

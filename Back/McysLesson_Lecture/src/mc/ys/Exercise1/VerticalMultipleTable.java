package mc.ys.Exercise1;

public class VerticalMultipleTable {

	public static void main(String[] args) {
		System.out.println("세로로 구구단을 출력합니다.\n");
		
		for (int i = 1 ; i <10 ; i++ ) {
			for (int j = 2 ; j < 10 ; j++ ) {
				System.out.printf("%d X %d = %2d   ",j,i,j*i);
			}
		System.out.println();
		}
	}
}

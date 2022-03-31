package mc.ys.Exercise1;

public class HorizenMultipleTable {

	public static void main(String[] args) {
		
		System.out.println("가로로 구구단을 출력합니다.");
		
		for(int i = 2 ; i < 10 ;i++) {
			for (int j = 1 ; j < 10 ; j ++ ) {
				System.out.printf("%d X %d = %2d  ",i,j,i*j);
				
			}
			System.out.println("\n");
		}
	}

}

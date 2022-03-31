package mc.ys.lesson1;

public class Test {
	
	public static void main(String[] args) {
		// 정수(int)형 변수 x, y, z 선언하세요
		
		int x = 1; // 이 줄 이후로 x가 등장하면 거기다가 =(등호)의 오른쪽에 해당하는 값을
		int y = 2; // 무조건 넣어줘  -> 이게 선언
		int z = 3;
		
		int	apple = x; // apple = 1 새폴더
		x = y;// x = 2 , y= 2 , z= 3
		y = z; // x=2, y=3, z=3
		z = apple; //
		//x = 2
		//y = 3
		//z = 1
		
		
	

		System.out.println("x = "+ x +" \n");
		System.out.printf("y = %d \n",y);
		System.out.printf("z = %d \n",z);
		
	}

}

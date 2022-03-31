package mc.ys.lesson1;

public class CodeFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 100;
		int b = 100;
		System.out.printf("a++ => %d %n",a++);
		System.out.printf("++b => %d %n",++b);
		System.out.printf("a => %d %n",a);
		System.out.printf("b => %d %n",b);
		
	}
	
	public void test() {
		int number = 1;
		for(int i=0;i<10;i++) {
			System.out.println(number);
			if(number==5) {
				break;
			}
			number++;
		}
	}

}

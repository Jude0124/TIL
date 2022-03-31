package mc.ys.lesson4;

public class TestEquals2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestEquals te = new TestEquals();
		te.test2();
	}
	public void test3() {
		//String 인스턴스 생성하세요
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		System.out.printf("str1 = %s str2 = %s %n", str1, str2);
		if(str1==str2) {
			System.out.println("str1==str2");
		} else {
			System.out.println("str1!=str2");
		}
		
		if(str1.equals(str2)) {
			System.out.println("str1.equals(str2)");
		} else {
			System.out.println("!str1.equals(str2)");
		}
		
	}
	public void test2() {
		//String 인스턴스 생성하세요
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		System.out.printf("str1 = %s str2 = %s %n", str1, str2);
		if(str1==str2) {
			System.out.println("str1==str2");
		} else {
			System.out.println("str1!=str2");
		}
		
		if(str1.equals(str2)) {
			System.out.println("str1.equals(str2)");
		} else {
			System.out.println("!str1.equals(str2)");
		}
		
	}
	
	public void test1() {
		int a = 1;
		int b = 1;
		if(a==b) {
			System.out.println("==");
		} else {
			System.out.println("!=");
		}
	}

}

package mc.ys.lesson4;

public class TestEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestEquals te = new TestEquals();
		te.test2();
		te.test1();

	}
	
	public void test2() {
		// String 인스턴스 생성하세요
		String bebrave = "be brave";
		String Hello = "Hello";
		System.out.printf("%s, mr.Jeong. %s enough to be yourself!",Hello,bebrave);
		
	}
	
	public void test1() {
		String str1 = new String("Hello");
		String str2 = new String("Hello") ;
		System.out.printf("str1 = %s str2 = %s  %n", str1 ,str2);
		if(str1==str2) {
			System.out.println("==");
		} else {
			System.out.println("!="); 
		}
		if(str1.equals(str2)) {
			System.out.println("str1.equals(str2)");
		} else {
			System.out.println("!str1.equals(str2)");
		}
		
	}

}

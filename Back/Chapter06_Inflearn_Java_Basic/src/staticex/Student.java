package staticex;

public class Student {
	
	private static int  serialNum = 10000;
	 
	int studentID;
	String studentName;
	
	public Student() {
		serialNum++;
		studentID = serialNum;
	}

	public static int getSerialNum() {
		int i = 10; // 지역변수
		
		i++;
		System.out.println(i); 
		
		//studentName = '홍길동'; //멤버변수, 인스턴스 변수
		// static에서 인스턴스 변수를 생성해서는 안된다. 
		// static 매서드는 인스턴스의 생성과 관계없이 클래스 이름으로 호출이 가능하기 때문이다.
		
		return serialNum; //static 변수, 클래스 변수
	}
	
}

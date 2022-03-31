package mc.ys.lesson4;

import java.util.Arrays;

public class TestString {

	public static void main(String[] args) {
		// test1() 메소드 호출하는 코드 작성하세요
		TestString ts = new TestString();
		ts.test2();
		
	}
	public void StudentShowInfo(String[] student) {
		
		System.out.println(Arrays.toString(student));
		
	}
	
	public void test2() {
		String studentKim  = "kim,39,49,59";
		String studentLee = "lee,39,49,59";
		String studentPark = "park,39,49,59";	
		
		String [] StudentKim = StudentSet(studentKim);
		String [] StudentLee = StudentSet(studentLee);
		String [] StudentPark = StudentSet(studentPark);
		
		StudentShowInfo(StudentKim);
 	}
	
	public String[]  StudentSet(String student) {
		
		String[] Student = student.split(",");
		
		return Student;
	}
	
	
	public void test1() {
		String number = "123456";
		int intnumber = Integer.parseInt(number);
		
		//위의 number를 앞에서 부터 하나씩 분리하여 출력하시오
		//분리한 후 분리된 숫자의 합을 구하시오
		int sum = 0 ;
		for (int i =  0 ; i < 6 ; i++) {
			sum += intnumber%10;
			System.out.println(intnumber%10);
			intnumber /= 10;
		}
		System.out.println(sum);
	}

}

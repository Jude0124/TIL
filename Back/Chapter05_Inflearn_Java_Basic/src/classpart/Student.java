package classpart;

public class Student {
	
	int studentID;
	String studentName;
	int Grade;
	String address;
	
	public Student() {}
	public Student(int id, String name) {
		studentID = id;
		studentName =name;
		
	} //디폴트 생성자 자바 컴파일러가 이러한 디폴트 생성자를 넣어준다 우리가 아무것도 작성안해도 이건 작성해준다 해당 클래스에 직접 작성한 생성자가 하나라도 있으면 디폴트생성자는 생성되지 않는다.
	
	public void showStudentInfor() {
		System.out.println(studentName+ "," + address);
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}

}

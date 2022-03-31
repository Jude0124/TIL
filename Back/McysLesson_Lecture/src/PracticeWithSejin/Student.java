package PracticeWithSejin;

public class Student{

	private String studentName;
	private int Korean;
	private int Math;
	private int English;
	
	public Student(){
		this.studentName = "홍길동";
		this.Korean = 0;
		this.Math = 0;
		this.English = 0;
	}
	
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getKorean() {
		return Korean;
	}

	public void setKorean(int korean) {
		Korean = korean;
	}

	public int getMath() {
		return Math;
	}

	public void setMath(int math) {
		Math = math;
	}

	public int getEnglish() {
		return English;
	}

	public void setEnglish(int english) {
		English = english;
	}

	public Student(String studentName, int Korean, int Math, int English){
		this.studentName = studentName;
		this.Korean = Korean;
		this.Math = Math;
		this.English = English;
		
	}
	
	public Student(String Info) {
		String[] InfoArray= Info.split(",");
		this.studentName = InfoArray[0];
		this.Korean = Integer.parseInt(InfoArray[1]);
		this.Math = Integer.parseInt(InfoArray[2]);
		this.English = Integer.parseInt(InfoArray[3]);
	}
	
	public void StudentShowInfo(){
		System.out.printf("학생의 이름은 %s입니다.",studentName);
		System.out.printf("학생의 국어 점수는 %d입니다.",Korean);
		System.out.printf("학생의 수학 점수는 %d입니다.", Math);
		System.out.printf("학생의 영어 점수는 %d입니다.", English);
		System.out.println();
	}
}

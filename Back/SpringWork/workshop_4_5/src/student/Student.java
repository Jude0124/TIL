package student;
//강사님덕분에 스프링 잘 배우고 있는것 같습니다. 감사합니다!!
public class Student {

	private String name;
	private int korean, english ,math , science;
	
	
	public Student() {
		super();
	}
	
	
	public Student(String name, int korean, int english, int math, int science) {
		super();
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;
		this.science = science;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKorean() {
		return korean;
	}
	public void setKorean(int korean) {
		this.korean = korean;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getScience() {
		return science;
	}
	public void setScience(int science) {
		this.science = science;
	}


	public double getAvg(){
		return (this.english + this.math + this.korean + this.science) / 4.0;
		
	}
	
	public String getGrade() {
		int avg = (int)getAvg();
		String grade = "F학점";
		
		switch(avg/10) {
		case 10:
		case 9:
			grade = "A학점";
			break;
		case 8:
		case 7:
			grade ="B학점";
			break;
		case 6:
		case 5:
			grade = "C학점";
			break;
		case 4:
		case 3:
			grade = "D학점";
			break;
		default :			
			break;

		}	
		return grade;		
	}
	
	@Override
	public String toString() {
		return "" + name + " 평균: " + getAvg() + " 학점: " + getGrade();
	}
}


package PracticeWithSejin;

public class Studenttest {
	
	public static void main(String[] args) {
		Student studentJames = new Student("James,0,10,11");
		studentJames.StudentShowInfo();
		Student studentTomas = new Student();
		studentTomas.StudentShowInfo();
		
//		studentTomas.getEnglish()
		Student studentRichard = new Student("James",0,2,11);
		studentRichard.StudentShowInfo();
		
	}

}

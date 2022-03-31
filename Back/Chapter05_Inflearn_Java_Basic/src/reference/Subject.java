package reference;

public class Subject {
	
	String subjectName;
	int score;
	
	public Subject(String name) {
		subjectName = name;
	
	}
	public void setSubjectName(String name) {
		subjectName = name;

	}


	public int getScore() {
		return score;
	}


	public void setScore(int score) {
		this.score = score;
	}


	public String getSubjectName() {
		return subjectName;
	}


}


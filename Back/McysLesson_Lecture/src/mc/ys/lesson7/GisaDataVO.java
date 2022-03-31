package mc.ys.lesson7;

public class GisaDataVO {
	
	private int studentID;
	private String emailAddress;
	private int korean;
	private int english;
	private int math;
	private int science;
	private int history;
	private int total;
	private String mgrCode;
	private String accCode;
	private String locCode;
	
	//생성자, getter/setter, toString() 오버라이드
	public int getStudentID() {
		return studentID;
		
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
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
	public int getHistory() {
		return history;
	}
	public void setHistory(int history) {
		this.history = history;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public String getMgrCode() {
		return mgrCode;
	}
	public void setMgrCode(String mgrCode) {
		this.mgrCode = mgrCode;
	}
	public String getAccCode() {
		return accCode;
	}
	public void setAccCode(String accCode) {
		this.accCode = accCode;
	}
	public String getLocCode() {
		return locCode;
	}
	public void setLocCode(String locCode) {
		this.locCode = locCode;
	}
	@Override
	public String toString() {
		return String.format("studentID = %d, kor = %d , eng = %d ,(kor+eng) = %d, locCode = %s",studentID,korean,english,korean+english,locCode);	
	}
	

	
	
	

}

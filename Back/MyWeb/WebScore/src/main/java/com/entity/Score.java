package com.entity;

public class Score {
	private String name;
	private int kor, eng, mat;
	private int tot;
	private double avg;
	private String grade;
	
	public Score() {
		super();
	}
	

	public Score(String name, int kor, int eng, int mat) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}
////////////계산형 메소드는 return code만 사용 : biz code
	public int getTot(){
		tot= this.getKor() + this.getEng() + this.getMat();
		return tot;
	}
	
	public double getAvg(){
		  avg=getTot()/3.0;
		 return avg;
	}
	
	public String getGrade(){		
	switch((int)getAvg()/10)
		{
		case 10:
		case 9: grade="A"; break;
		case 8: grade="B"; break;
		case 7: grade="C"; break;
		case 6: grade="D"; break;
		default: grade="F";
		}		
		return grade;
	}
	
}



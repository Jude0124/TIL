package com.test03;

import org.springframework.beans.factory.annotation.Autowired;


public class School {
	@Autowired
	private Student person;
	private int grade;
	
	public Student getPerson() {
		return person;
	}

	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "School [person=" + person + ", grade=" + grade + "]";
	}
	
}

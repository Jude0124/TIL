package com.test05;

import org.springframework.stereotype.Component;

@Component("student")
public class Student implements Person {

	@Override
	public void classWork() {
		System.out.println("[학생]들은 회의실 열고 줌 수업을 진행한다.");
	}

}

package com.test05;

import org.springframework.stereotype.Component;

@Component("g7")
public class G7_Class implements Person {
	
	@Override
	public void classWork() {
		System.out.println("[강사]는 회의실 열고 줌 수업을 진행한다.");

	}

}

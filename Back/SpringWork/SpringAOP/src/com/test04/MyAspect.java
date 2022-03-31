package com.test04;

import org.aspectj.lang.JoinPoint;


public class MyAspect  {
	
	public void before(JoinPoint joinpoint) {
		System.out.println("노트북 줌 로그인 후 실행한다. 출석 체크");
	}
	
	public void throwing(JoinPoint joinpoint, Throwable e) {
		System.out.println("멀티 캠퍼스 공사 하는 날 : " + e);
	}

	public void after(JoinPoint joinpoint) {
		System.out.println("로그아웃 한다.");
	}
}


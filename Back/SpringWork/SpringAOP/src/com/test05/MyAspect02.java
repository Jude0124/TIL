package com.test05;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

// beans.xml <aop:>로 선언
public class MyAspect02  {
	

public void before(JoinPoint joinpoint) {
		System.out.println("노트북 줌 로그인 후 실행한다. 출석 체크");
	}
	

	public void after(JoinPoint joinpoint) {
		System.out.println("로그아웃 한다.");
	}
}


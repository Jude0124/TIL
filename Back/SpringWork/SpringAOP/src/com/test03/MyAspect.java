package com.test03;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect  {
	@Before("execution(public void com.test03.*.*(..))")
	public void before(JoinPoint joinpoint) {
		System.out.println("노트북 줌 로그인 후 실행한다. 출석 체크");
	}
	@AfterThrowing(pointcut ="execution(public void com.test03.*.*(..))", throwing = "e" )
	public void throwing(JoinPoint joinpoint, Throwable e) {
		System.out.println("멀티 캠퍼스 공사 하는 날 : " + e);
	}
	@After("execution(public * *(..))")
	public void after(JoinPoint joinpoint) {
		System.out.println("로그아웃 한다.");
	}
}


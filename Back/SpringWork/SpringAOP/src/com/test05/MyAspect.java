package com.test05;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component("myAdvice")
@Aspect
public class MyAspect {

	@Pointcut("execution(* classWork())")
	private void myClass() {
	} // 조건 : 반드시 private 이고 매개변수가 동일하고 빈 클래스여야함

	@Before("myClass()")
	public void before(JoinPoint joinpoint) {
		System.out.println("노트북 줌 로그인 후 실행한다. 출석 체크");
	}

	@After("myClass()")
	public void after(JoinPoint joinpoint) {
		System.out.println("로그아웃 한다.");
	}
}

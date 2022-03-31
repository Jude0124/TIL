package com.test04;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/test04/Beans.xml");
		
		Person p = ac.getBean("student", Person.class);
		
		p.classWork();
		
		((AbstractApplicationContext) ac).close();
	}

}

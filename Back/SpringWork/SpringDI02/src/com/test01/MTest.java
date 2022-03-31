package com.test01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MTest {
	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext(new String[] { "com/test01/beans.xml"});
		Nic_NamePrn prn = context.getBean("mynamePrn", Nic_NamePrn.class);
		System.out.println(prn);
	}
}

package sample08;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sample02.Address;

public class Sample8Main {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("sample08/applicationContext.xml");
		
		System.out.println("=================================");
		
		Address a1 = ac.getBean("addr01", Address.class);
		System.out.println(a1);
		
		a1 = ac.getBean("addr02", Address.class);
		System.out.println(a1);
	}

}

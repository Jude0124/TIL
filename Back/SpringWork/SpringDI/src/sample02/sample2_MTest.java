package sample02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class sample2_MTest {

	public static void main(String[] args) {

		ApplicationContext ac = new ClassPathXmlApplicationContext("sample02/MyBeans.xml");
		Address myaddr01 = ac.getBean("myaddr01", Address.class);
		System.out.println(myaddr01);

		/*
		 * Address myaddr02 = ac.getBean("myaddr02",Address.class);
		 * System.out.println(myaddr02);
		 */
		myaddr01 = ac.getBean("myaddr02", Address.class);
		System.out.println(myaddr01);

		myaddr01 = ac.getBean("myaddr03", Address.class);
		System.out.println(myaddr01);

		
		System.out.println("===============================");
		ListAddress mylist01 = ac.getBean("mylist01", ListAddress.class);
		System.out.println(mylist01);
		System.out.println(mylist01.getAddr());

		mylist01 = ac.getBean("mylist02", ListAddress.class);
		System.out.println(mylist01);
		System.out.println(mylist01.getAddr());
		
		mylist01 = ac.getBean("mylist03", ListAddress.class);
		System.out.println(mylist01);
		System.out.println(mylist01.getAddr());
		
		mylist01 = ac.getBean("mylist04", ListAddress.class);
		System.out.println(mylist01);
		System.out.println(mylist01.getAddr());
	}
}

package book;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class BookTest_M {

	public static void main(String[] args) {
		
		ApplicationContext ac = 
				new ClassPathXmlApplicationContext("book/applicationContext.xml");

		System.out.println("책이름\t\t가격\t할인율\t할인후가격");
		System.out.println("----------------------------------------");
		
		Book bk = ac.getBean("book1", Book.class);
		System.out.println(bk.toString());
		
		bk = ac.getBean("book2", Book.class);
		System.out.println(bk.toString());
		
		bk = ac.getBean("book3", Book.class);
		System.out.println(bk.toString());
		


	}

}

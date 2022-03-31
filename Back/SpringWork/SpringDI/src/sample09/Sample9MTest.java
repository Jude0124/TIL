package sample09;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Sample9MTest {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("sample09/applicationContext.xml");
		
		MyFoodMgr obj = factory.getBean("myFood",MyFoodMgr.class);
		System.out.println(obj);
	}

}

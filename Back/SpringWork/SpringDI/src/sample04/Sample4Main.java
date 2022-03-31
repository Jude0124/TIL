package sample04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Sample4Main {
	public static void main(String[] args) {
		ApplicationContext factory
		= new ClassPathXmlApplicationContext("sample4/app.xml");

		AbstractTest bean = (AbstractTest) factory.getBean("test");

		System.out.println("오늘은  " + bean.dayInfo());

		//beans 객체를 소멸 하는 메소드  
		((ClassPathXmlApplicationContext) factory).close();
//		bean = (AbstractTest) factory.getBean("test"); //이미 소멸된 객체를 또 선언하면 
		System.out.println("오늘은  " + bean.dayInfo()); //close 되있기 때문에 에러 발생
	}
}



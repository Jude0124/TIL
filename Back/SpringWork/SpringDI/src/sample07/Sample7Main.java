package sample07;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Sample7Main {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("sample07/applicationContext.xml");
		
		Parent obj = ac.getBean("child02", Parent.class);
		System.out.println(obj.getEmail());
		
		System.out.println("========================");
		
		obj = ac.getBean("child", Parent.class);
		System.out.println(obj.getEmail());
		
		System.out.println("========================");
		
//		obj = ac.getBean("myparent", Parent.class); // 추상클래스라서 객체생성이 안되용~
//		System.out.println(obj.getEmail()); // error
	}

}

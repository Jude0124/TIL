package student;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test05_M {

	public static void main(String[] args) {
		
		ApplicationContext ac = 
				new ClassPathXmlApplicationContext("student/applicationContext.xml");
		Student st = ac.getBean("stud1", Student.class);
		System.out.println(st.toString());
		
		st = ac.getBean("stud2", Student.class);
		System.out.println(st.toString());
		
		st = ac.getBean("stud3", Student.class);
		System.out.println(st.toString());
		

	}

}

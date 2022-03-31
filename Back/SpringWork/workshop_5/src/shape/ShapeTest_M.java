package shape;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ShapeTest_M {

	public static void main(String[] args) {
		Shape shape[] = new Shape[6];
		
		ApplicationContext ac = 
				new ClassPathXmlApplicationContext("shape/applicationContext.xml");

		
		Triangle sha1 = ac.getBean("sha1", Triangle.class);
		Rectangle sha2 = ac.getBean("sha2", Rectangle.class);
		Triangle sha3 = ac.getBean("sha3", Triangle.class);
		Rectangle sha4 = ac.getBean("sha4", Rectangle.class);
		Triangle sha5 = ac.getBean("sha5", Triangle.class);
		Rectangle sha6 = ac.getBean("sha6", Rectangle.class);

		shape[0] = sha1;
		shape[1] = sha2;
		shape[2] = sha3;
		shape[3] = sha4;
		shape[4] = sha5;
		shape[5] = sha6;

		System.out.println("기본정보");

		for (int i = 0; i < shape.length; i++) {
			System.out.println(shape[i]);
		}

		System.out.println("\n사이즈 변경 후 정보");

		sha1.setResize(5);
		sha2.setResize(5);
		sha3.setResize(5);
		sha4.setResize(5);
		sha5.setResize(5);
		sha6.setResize(5);
		for (int i = 0; i < shape.length; i++) {
			System.out.println(shape[i]);
		}

	}

}

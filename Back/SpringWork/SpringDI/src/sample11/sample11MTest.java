package sample11;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class sample11MTest {
	
	public static void main(String[] args) {
		ApplicationContext factory = new AnnotationConfigApplicationContext(MemberFactory.class);
		
		MemberDAO memberdao = factory.getBean("getMemberDAO", MemberDAO.class);
		MemberDTO m 		= new MemberDTO("111", "111", "111");
		
		try {
			int r = memberdao.getInsert(m);
			if(r > 0) {
				System.out.println("입력 성공");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}//catch
	}//main

}//class

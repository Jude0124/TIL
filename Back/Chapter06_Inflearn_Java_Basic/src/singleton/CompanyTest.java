package singleton;

import java.util.Calendar;

public class CompanyTest {

	public static void main(String[] args) {
		
		Company c1 = Company.getInstance();
		
		Company c2 = Company.getInstance();
		
		//Company c3 = new Company(); //error
		System.out.println(c1==c2); //true
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		}

}

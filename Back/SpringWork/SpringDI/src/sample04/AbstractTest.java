package sample04;

import java.util.Calendar;
import java.util.GregorianCalendar;

abstract public class AbstractTest {//싱글톤 패턴을 구현
	abstract public String dayInfo(); //추상 메소드
	
	public static AbstractTest getInstance(){
		//싱글톤 : 현재 클래스를 객체 생성한다음 static으로 리턴한다.  
		
		GregorianCalendar cal=new GregorianCalendar();
		int day=cal.get(Calendar.DAY_OF_WEEK);
		switch(day)
		{
			case 1 : return new Sunday();
			case 2 : return new Monday();
			case 3 : return new Tuesday();
			case 4 : return new Wednesday();
			case 5 : return new Thursday();
			case 6 : return new Friday();
			case 7 : return new Saturday();
		}
		return null;
	}
}















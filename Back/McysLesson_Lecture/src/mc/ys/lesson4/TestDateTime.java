package mc.ys.lesson4;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import mc.ys.utils.DateService;

public class TestDateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		TestDateTime tdt = new TestDateTime();
//		tdt.testCalendar();
//		tdt.testDate();
				
		DateService now = new DateService();
		String nowtime = now.getDateInfo(DateService.FULL_INFO);
//		
//		String now = DateService.getDateInfo(DateService.FULL_INFO);
		System.out.println(nowtime);
	}
	
	public void testCalendar() {
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		int date = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println("date"+date);
		System.out.printf("%d-%d-%d %d:%d:%d",year,month,day,hour,min,sec);
		System.out.println();
		
		
		
		String pattern = "(EEE) (MMM) yyyy-MM-dd HH:mm:ss";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String now = sdf.format(new Date());
		System.out.println(now);
		
		
//		String pattern = "yyyy-MM-dd HH:mm:ss";
//		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
//		String now = sdf.format(null);
		
	}
	public void testDate() {
		//Date 클래스 인스턴스 생성하시오
		Date date = new Date();
		int year = date.getYear()+1900;
		int month = date.getMonth()+1;
		int day = date.getDate();
		
		int hour = date.getHours();
		int min = date.getMinutes();
		int sec = date.getSeconds();
		System.out.printf("%d-%d-%d %d:%d:%d",year,month,day,hour,min,sec);
	}

}

package sample06;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Foo {
	private Bar bar;// has ~ a

	public Foo() {
		System.out.println("no-args 생성자");
	}

	public Foo(Date d) {
		System.out.println("생성자 -->" + d);
	}

	public void setBar(Bar bar) {
		this.bar = bar;
		System.out.println("setBar() 메서드 호출");
	}

	public void setDate(Date date) {
		System.out.println("setDate() 메서드 호출  : " + date);
	}

	public void setNumber(int number) {
		System.out.println("setNumber() 메서드 호출 : " + number);
	}

	public void setInfo(List<String> item) {
		System.out.println("setInfo()  메소드 호출 ");
		for (String res : item) {
			System.out.println(res);
		}
	}

	public void setStudents(String[] item) {
		// []를 가진 값들은 <list> <array>로 값 전달 .
		System.out.println("setStudents() 메서드 호출");
		for (String name : item) {
			System.out.println("학생  : " + name);
		}
	}
	public void setEvent(Set<String> item) {
		System.out.println("setEvent() 메서드 호출");
		for (String name : item) {
			System.out.println("이벤트응모  : " + name);
		}
	}
	public void setTelNumber(Map<String, String> item) {
		System.out.println("setTelNumber() 메서드 호출");
		Set<String> keys = item.keySet();
		for (String key : keys)
			System.out.println(key + "의 전화번호 : " + item.get(key));
	}
	public void fooMethod() {
		System.out.println("Foo 클래스의 fooMethod() 메서드...");
		bar.pr();
	}
}


package com.test03;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ImportResource;

//org.springframework.context.annotation.ImportResource
//<import/>
@ImportResource("classpath:/com/test03/AppConfig")
public class Student {
	
	@Value("${myname}")
	private String name;
	
//	@Value("${myaddr}")
	@Value("인천")
	private String address;
	
	@Value("${myage}")
	private int age;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public int getAge() {
		return age;
	}



	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + ", age=" + age + "]";
	}
}

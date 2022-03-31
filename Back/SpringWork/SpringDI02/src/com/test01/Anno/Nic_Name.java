package com.test01.Anno;

import org.springframework.stereotype.Component;

//4. class Nic_Name 를 @Component 을 통해서 객체가 생성된다.
@Component	 // <bean  id = "nic_Name" class="com.test01.Anno.Nic_Name /> 처럼...
public class Nic_Name {

	@Override
	public String toString() {
		return "Nic_Name [호랑이]";
	}

}

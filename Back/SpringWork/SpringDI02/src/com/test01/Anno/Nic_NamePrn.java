package com.test01.Anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


//5. @Component("MyTest") 를 이용해서 
@Component("MyTest") //<bean id="MyTest" class = "com.test01.Anno.NIc_NamePrn"/>
public class Nic_NamePrn {
	/* //<bean id="MyTest" class = "com.test01.Anno.NIc_NamePrn"/>
			<property name = "nic_name" ref = "nic_Name">
		</bean>
	*/	
	
	@Autowired // public Nic_NamePrn(Nic_Name nic_name){} 없으면 아래로
			   // public void setNic_Name(Nic_Name nic_name) {}
	Nic_Name nic_name;


	@Override
	public String toString() {
		return "Nic_NamePrn [nic_name=" + nic_name + "]";
	}

}

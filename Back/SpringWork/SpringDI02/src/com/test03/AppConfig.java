package com.test03;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.PropertySource;

//2. @Configuration // <beans/>로 인해 각각의 @Bean의 객체를 생성해서 <bean />으로 관리
@Configuration // <beans/>
@PropertySource("classpath:/com/test03/a.properties") // 3.리소스를 호출
public class AppConfig {

	@Bean(name = "school")//@Bean({"b1", "b2"})   b1 = getSchool
	@DependsOn("student")
	public School getSchool() {
		School sm = new School();
		sm.setGrade(3);
		return sm;

	}

	@Bean(name = "student")
	public Student getStudent() {
		Student s = new Student();
		s.setAddress("111111111111");
		return s;
	}
}

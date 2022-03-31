package com.model;

import org.springframework.stereotype.Repository;

@Repository
public class HelloDao {
	
	public String getHello() {
		return "HelloDao 야 ";
	}

}

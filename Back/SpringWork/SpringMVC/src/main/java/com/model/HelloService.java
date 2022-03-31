package com.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

	@Autowired //주석처리된 부분이 autowired한줄로 처리가 끝남
 	private HelloDao helldao;
	
//	public HelloService(HelloDao hellodao) {
//		this.helldao = helldao;
//	}
//	
//	public void setHelloDao(HelloDao hellodao) {
//		this.helldao = hellodao;
//		
//	}
	
	public String getHello() {
		return helldao.getHello();
	}
}	

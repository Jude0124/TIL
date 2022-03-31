package com.test02;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy
@Component("lg")
public class LgTV implements TV {

	public LgTV() {
		super();
		System.out.println("LgTV 객체가 생성되었어요...");
	}

	@Override
	public void powerOn() {
		System.out.println("LgTV --- 전원을 켠다.");
		
	}

	@Override
	public void powerOff() {
		System.out.println("LgTV --- 전원을 끈다.");
		
	}

	@Override
	public void volumnUp() {
		System.out.println("LgTV --- 소리를 높인다.");
		
	}

	@Override
	public void volumnDown() {
		System.out.println("LgTV --- 소리를 줄인다.");
		
	}

}

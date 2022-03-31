package com.test01;

import java.util.function.Function;

public class MTest {
	public static void main(String[] args) {
		//Function<T,R>  : 인수를 T로 받고 R로 리턴하는 함수를 선언 , R apply(T t)
		Function<Integer, String> M_fun = (i) -> Integer.toString(i);
		//			T   ,  R    => String apply
		
		System.out.println(M_fun.apply(100).length());
		
		System.out.println(M_fun.apply(1000).length());
	}

}

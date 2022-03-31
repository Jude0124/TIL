package com.test01;

import java.util.function.BiFunction;
import java.util.function.Function;

public class MTest01 {

//2. BiFunction<String, String, String> 실습
	
	public static void main(String[] args) {

//Getting Start Jaa ! !
		BiFunction<String, String, String> bi = (x, y) -> {
			return x+y;
		};
		
		
		Function <String, String >  f=  x -> x+ " !";
		
 	System.out.println(bi.andThen(f).andThen(f).apply("Getting Start", "Java"));
	
 	
	}

	
	
	

}



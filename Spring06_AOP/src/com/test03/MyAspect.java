package com.test03;


import org.aspectj.lang.JoinPoint;

public class MyAspect {
	
	public void before(JoinPoint join) {
		System.out.println(join.getTarget().getClass());
		System.out.println("QR코드로 출석 처리를 한다");
	}
	
	public void after(JoinPoint join) {
		System.out.println("집에 간다.");
		
	}
	
	
	
}

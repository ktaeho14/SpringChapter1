package com.test01;

import org.aspectj.lang.JoinPoint;

public class MyAspect {
	public void before(JoinPoint join) {
		System.out.println("컴퓨터를 킨다");
	}
	
	public void after(JoinPoint join) {
		System.out.println("컴퓨터를 끈다");
		
	}
}

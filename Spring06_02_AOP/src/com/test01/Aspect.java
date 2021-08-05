package com.test01;

import org.aspectj.lang.JoinPoint;

public class Aspect {
	
	
	public void before(JoinPoint join) {
		System.out.println("before");
	}
	
	public void after(JoinPoint join) {
		System.out.println("¼ö¾÷³¡");
	}
	
	
}

package com.test03;


import org.aspectj.lang.JoinPoint;

public class MyAspect {
	
	public void before(JoinPoint join) {
		System.out.println(join.getTarget().getClass());
		System.out.println("QR�ڵ�� �⼮ ó���� �Ѵ�");
	}
	
	public void after(JoinPoint join) {
		System.out.println("���� ����.");
		
	}
	
	
	
}

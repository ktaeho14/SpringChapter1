package com.test01;

import org.aspectj.lang.JoinPoint;

public class MyAspect {
	public void before(JoinPoint join) {
		System.out.println("��ǻ�͸� Ų��");
	}
	
	public void after(JoinPoint join) {
		System.out.println("��ǻ�͸� ����");
		
	}
}

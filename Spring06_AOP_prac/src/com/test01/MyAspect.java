package com.test01;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;



public class MyAspect {
	
	public void before(JoinPoint join) {
		System.out.println("�� ���ǴٿԾ�");
	}
	
	public void after(JoinPoint join) {
		System.out.println("6���� ���� ������");
	}
}

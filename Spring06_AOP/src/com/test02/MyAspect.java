package com.test02;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyAspect implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		
		Object target = null;
		
		System.out.println("QR�ڵ�� �Խ� ó�� �Ѵ�.");
		
		try {
			target = invocation.proceed();
		}catch(Throwable e) {
			System.out.println("���� ���̾���.");
		}finally {
			System.out.println("���� ����.");
		}
		
		
		
		return target;
	}
	
}

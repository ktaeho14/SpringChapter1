package com.test02;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyAspect implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		
		Object target = null;
		
		System.out.println("QR코드로 입실 처리 한다.");
		
		try {
			target = invocation.proceed();
		}catch(Throwable e) {
			System.out.println("쉬는 날이었다.");
		}finally {
			System.out.println("집에 간다.");
		}
		
		
		
		return target;
	}
	
}

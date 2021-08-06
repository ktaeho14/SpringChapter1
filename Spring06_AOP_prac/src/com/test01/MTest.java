package com.test01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		
		ApplicationContext factory = new
				ClassPathXmlApplicationContext("com/test01/applicationContext.xml");
		
		Person m = factory.getBean("man",Person.class);
		Person w = factory.getBean("woman",Person.class);
		
		
		System.out.println("학원가자...");
		m.classWork();
		System.out.println("수업 끝 집 가자");
		
		
		System.out.println("==============");
		System.out.println("여학생도 학원가자....");
		w.classWork();
		System.out.println("수업 끝 집 가자");
	}

}

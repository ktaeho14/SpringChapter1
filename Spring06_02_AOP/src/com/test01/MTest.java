package com.test01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	public static void main(String[] args) {
		ApplicationContext factory = new
				ClassPathXmlApplicationContext("com/test01/applicationContext.xml");
		
		
		Person m = factory.getBean("man",Person.class);
		
		System.out.println("학원가자");
		m.classWork();
		System.out.println("집에가자");
		
		
	}
}

package com.test05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	public static void main(String[] args) {
		ApplicationContext factory = new
				ClassPathXmlApplicationContext("com/test05/applicationContext.xml");
		
		Developer kim = (Developer)factory.getBean("leess");
		Engineer hong = (Engineer)factory.getBean("honggd");
				
		System.out.println(kim);
		System.out.println(hong);
	}
}

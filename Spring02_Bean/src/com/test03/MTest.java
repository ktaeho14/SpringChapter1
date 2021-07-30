package com.test03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		ApplicationContext factory = new
				ClassPathXmlApplicationContext("com/test03/applicationContext.xml");
		
		
		Address kim = (Address)factory.getBean("kim");
		Address park = (Address)factory.getBean("park");
		
		System.out.println(kim);
		System.out.println(park);

	}

}

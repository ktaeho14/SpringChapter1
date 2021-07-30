package com.test03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		
		/*
		 * Resource res = new ClassPathResource("com/test03/beans.xml");
		 * BeanFactory = new XmlBeanFactory(res);
		 * 
		 */
		
		
		
		
		//beanfactory 생성		
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test03/beans.xml");
		
		//내가 원하는 bean가져오기
		MessageBean bean = (MessageBean)factory.getBean("korean");
		bean.sayHello("스프링");
		
		bean = (MessageBean)factory.getBean("english");
		bean.sayHello("Spring");
		
		//빈팩토리: 처음 getBean() 호출된 시점에서 해당 빈 생성(lazy loading, 게으른 호출)
		//애플리케이션컨텍스트: 컨텍스트 초기화 시점에 모든 싱글톤 빈을 미리 로드 한 후 빈을 지연없이 얻을 수 있음
		
		
	}

}

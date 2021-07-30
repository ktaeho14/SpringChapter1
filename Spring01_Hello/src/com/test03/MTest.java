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
		
		
		
		
		//beanfactory ����		
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test03/beans.xml");
		
		//���� ���ϴ� bean��������
		MessageBean bean = (MessageBean)factory.getBean("korean");
		bean.sayHello("������");
		
		bean = (MessageBean)factory.getBean("english");
		bean.sayHello("Spring");
		
		//�����丮: ó�� getBean() ȣ��� �������� �ش� �� ����(lazy loading, ������ ȣ��)
		//���ø����̼����ؽ�Ʈ: ���ؽ�Ʈ �ʱ�ȭ ������ ��� �̱��� ���� �̸� �ε� �� �� ���� �������� ���� �� ����
		
		
	}

}

package com.test01;

import java.util.Date;

public class BeanTest {
	public BeanTest() {
		System.out.println("�⺻ ������(no-args)");
	}
	
	public BeanTest(Date date) {
		System.out.println("��¥ ������(date: " + date+")");
	}
	
	public void setMyClass(MyClass myClass) {
		System.out.println("setMyClass() ȣ��: " + myClass);
	}
	
	public void setDate(Date date) {
		System.out.println("setDate() ȣ��: " + date);
	}
	
	public void setNumber(int num) {
		System.out.println("setNumber() ȣ��: " + num);
	}
	
	public void setArray(String[] arr) {
		System.out.println("setArray() ȣ��: ");
		for(String val : arr) {
			System.out.println("�̸�: " + val);
		}
		
	}
	
	
}

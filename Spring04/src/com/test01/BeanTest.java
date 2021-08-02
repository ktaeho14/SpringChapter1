package com.test01;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
	
	public void setList(List<String> list) {
		System.out.println("setList() ȣ��: ");
		for(String val : list) {
			System.out.println(val);
		}
	}
	
	
	public void setSet(Set<String> set) {
		System.out.println("setSet() ȣ��");
		for(String val : set) {
			System.out.println(val);
		}
	}
	
	
	public void setMap(Map<String,String> map) {
		System.out.println("setMap() ȣ��");
		Collection<String> values= map.values();
		
		for(String val : values) {
			System.out.println(val);
		}
	}
	
	
	public void setScore(List<Score> list) {
		System.out.println("setScore() ȣ��");
		for(Score sc : list) {
			System.out.println(sc);
		}
	}
	
	
	
}

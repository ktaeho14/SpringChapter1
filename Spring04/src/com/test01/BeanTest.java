package com.test01;

import java.util.Date;

public class BeanTest {
	public BeanTest() {
		System.out.println("기본 생성자(no-args)");
	}
	
	public BeanTest(Date date) {
		System.out.println("날짜 생성자(date: " + date+")");
	}
	
	public void setMyClass(MyClass myClass) {
		System.out.println("setMyClass() 호출: " + myClass);
	}
	
	public void setDate(Date date) {
		System.out.println("setDate() 호출: " + date);
	}
	
	public void setNumber(int num) {
		System.out.println("setNumber() 호출: " + num);
	}
	
	public void setArray(String[] arr) {
		System.out.println("setArray() 호출: ");
		for(String val : arr) {
			System.out.println("이름: " + val);
		}
		
	}
	
	
}

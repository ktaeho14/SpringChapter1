package com.test03;

import org.springframework.beans.factory.annotation.Qualifier;


public class Student {
	
	
	private String name;
	private String addr;
	private String age;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, String addr, String age) {
		super();
		this.name = name;
		this.addr = addr;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	
	
	@Override
	public String toString() {
		return "이름: " + name + "\t주소: " + addr + "\t나이: " + age;
	}
	
	
	
}

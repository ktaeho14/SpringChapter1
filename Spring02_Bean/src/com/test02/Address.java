package com.test02;

public class Address {
	private String name;
	private String addr;
	private String phone;
	
	
	
	
	//기본 생성자
	public Address() {
		
	}
	
	//매개변수 생성자
	public Address(String name, String addr, String phone) {
		super();
		this.name = name;
		this.addr = addr;
		this.phone = phone;
	}
	
	//toString
	@Override
	public String toString() {
		return "이름: " + name + " 주소: " + addr + " 전화번호: " + phone;
	}
	
	
	
	
	
	
}

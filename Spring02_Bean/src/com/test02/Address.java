package com.test02;

public class Address {
	private String name;
	private String addr;
	private String phone;
	
	
	
	
	//�⺻ ������
	public Address() {
		
	}
	
	//�Ű����� ������
	public Address(String name, String addr, String phone) {
		super();
		this.name = name;
		this.addr = addr;
		this.phone = phone;
	}
	
	//toString
	@Override
	public String toString() {
		return "�̸�: " + name + " �ּ�: " + addr + " ��ȭ��ȣ: " + phone;
	}
	
	
	
	
	
	
}

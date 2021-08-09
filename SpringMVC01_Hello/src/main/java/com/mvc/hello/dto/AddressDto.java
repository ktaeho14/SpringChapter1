package com.mvc.hello.dto;

public class AddressDto {
	private String name;
	private String addr;
	private String phone;
	
	
	//기본 생성자
	public AddressDto() {
		super();
		
	}
	
	//매개변수 생성자
	public AddressDto(String name, String addr, String phone) {
		super();
		this.name = name;
		this.addr = addr;
		this.phone = phone;
	}
	
	
	//getter &setter
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}

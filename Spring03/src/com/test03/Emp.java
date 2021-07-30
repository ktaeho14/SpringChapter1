package com.test03;

public class Emp {
	private String name;
	private int salary;
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "이름: " + name + "\t월급: " + salary;
	}
	
	
}

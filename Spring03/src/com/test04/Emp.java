package com.test04;

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
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	@Override
	public String toString() {
		return "�̸�: " + name + "\t����: " + salary;
	}
	
	
}

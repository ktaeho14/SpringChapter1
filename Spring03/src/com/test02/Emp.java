package com.test02;

public class Emp {
	private String name;
	private int salary;
	
	
	//기본생성자
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//매개변수 생성자
	public Emp(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	
	//getter & setter
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
	
	
	//toString
	@Override
	public String toString() {
		return "이름: " + name + "\t월급: " + salary;
	}
	
	
	
}

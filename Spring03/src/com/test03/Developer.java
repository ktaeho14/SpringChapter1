package com.test03;

public class Developer extends Emp{
	private String dept;

	
	//매개변수가 없는 기본 생성자
	public Developer() {
		super();
		
	}

	//부모클래스로 넘겨주는 매개변수 생성자
	public Developer(String name, int salary) {
		super(name, salary);
		
	}
	
	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return super.toString() + "\t부서: " + dept;
	}
	
	
}

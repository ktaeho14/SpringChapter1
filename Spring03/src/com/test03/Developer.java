package com.test03;

public class Developer extends Emp{
	private String dept;

	
	//�Ű������� ���� �⺻ ������
	public Developer() {
		super();
		
	}

	//�θ�Ŭ������ �Ѱ��ִ� �Ű����� ������
	public Developer(String name, int salary) {
		super(name, salary);
		
	}
	
	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return super.toString() + "\t�μ�: " + dept;
	}
	
	
}

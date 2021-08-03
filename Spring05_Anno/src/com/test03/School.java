package com.test03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class School {
	@Autowired
	@Qualifier("hong")
	private Student person;
	
	
	private int grade;
	
	
	public School(Student person, int grade) {
		super();
		this.person = person;
		this.grade = grade;
	}
	public School() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student getPerson() {
		return person;
	}
	public void setPerson(Student person) {
		this.person = person;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "School [person=" + person + ", grade=" + grade + "]";
	}
	
	
	
	
	
	
	
	
}

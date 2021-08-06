package com.test01;

import org.springframework.stereotype.Component;

public class Man implements Person{

	
	@Override
	public void classWork() {
		System.out.println("남학생 입장");
	}
	
	
}

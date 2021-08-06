package com.test01;

import org.springframework.stereotype.Component;

public class Woman implements Person{

	
	@Override
	public void classWork() {
		System.out.println("여학생 입장");
	}

}

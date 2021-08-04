package com.test01;

public class Woman {
	public void classWork() {
		System.out.println("QR코드로 입실처리를 한다.");
		
		try {
			System.out.println("컴퓨터를 켜서 이클립스를 실행한다.");
		}catch(Exception e){
			System.out.println("쉬는 날이었다.");
		}finally {
			System.out.println("집에간다.");
		}
		
		
		
	}
}

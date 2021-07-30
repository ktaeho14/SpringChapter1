package com.test06;

public class SamsungTV implements TV{

	
	
	
	public SamsungTV() {
		System.out.println("samsungTV »ý¼º");
	}

	@Override
	public void powerOn() {
		System.out.println("samsung tv on");
		
	}

	@Override
	public void PowerOff() {
		System.out.println("samsung tv off");
		
	}

	@Override
	public void volUp() {
		System.out.println("samsung tv vol up");
		
	}

	@Override
	public void volDown() {
		System.out.println("samsung tv vol down");
		
	}

}

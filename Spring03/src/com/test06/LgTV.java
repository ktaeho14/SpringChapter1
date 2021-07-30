package com.test06;

public class LgTV implements TV {

	
	public LgTV() {
		System.out.println("lg tv »ý¼º");
	}
	
	@Override
	public void powerOn() {
		System.out.println("lg tv on");
		
	}

	@Override
	public void PowerOff() {
		System.out.println("lg tv off");
		
	}

	@Override
	public void volUp() {
		System.out.println("lg tv vol up");
		
	}

	@Override
	public void volDown() {
		System.out.println("lg tv vol down");
		
	}

}

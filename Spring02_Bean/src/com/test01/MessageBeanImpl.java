package com.test01;

public class MessageBeanImpl implements MessageBean {
	
	private String fruit;
	private int cost;
	
	public MessageBeanImpl() {
		this.fruit = "apple";
		this.cost = 5000;
	}
	
	
	
	public MessageBeanImpl(String fruit, int cost) {
		this.fruit = fruit;
		this.cost = cost;
	}



	@Override
	public void sayHello() {
		System.out.println("과일: " + fruit +"\t가격: " + cost);
		
	}
	

}

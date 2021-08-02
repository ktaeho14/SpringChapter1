package com.test01;

public class Score {
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	
	//기본생성자
	public Score() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	//매개변수 생성자
	public Score(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	
	//getter & setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	
	//to_String 메소드
	@Override
	public String toString() {
		return "이름 : " + name + "\t국어: " + kor + "\t영어: " + eng + "\t수학: " + math;
	}

	
	
	
	
}

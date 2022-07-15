package com.iu.unit;

public abstract class Unit {
	//abstract가 붙으면 Unit클래스는 객체를 못만듦->무조건 상속해서 사용
	
	//클래스간의 공통 요소를 모아놓는 클래스
	
	private int hp;
	private String color;
	private String name;
	
	public Unit(int hp) {
		System.out.println("Super 생성자");
		this.hp=hp;
	}
	
	//move 
	public abstract void move();//->완성되지 않은 메서드
	
	public void info() {
		System.out.println("Super Info");
	}
	
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}

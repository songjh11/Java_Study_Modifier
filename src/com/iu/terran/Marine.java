package com.iu.terran;

import com.iu.unit.Attacker;
import com.iu.unit.Unit;

public class Marine extends Unit implements Attacker {
	
	private String weapon;
	
	public Marine() {
		//super();생략된것, 부모의 생성자 호출하고 객체 생성해서 자식 객체를 확장해서 생성
		//this();<-에러남, 첫줄이 아니니까
		super(30);//<-super클래스에서 매개변수를 필요한 메서드로 만들었기 때문에 매개변수를 넣어줘야 에러 안남
		System.out.println("Marine 생성자");
	}
	
	public String getWeapon() {
		return weapon;
	}
	
	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}
	
	//오버라이딩
	public void move() {
		System.out.println("뛰어다님");
	};
	
	public void info() {//오버라이딩, 메서드 선언 자체가 오버라이딩임
		super.info();
		System.out.println("Marine Info");
	}
	public void attack() {
		this.shoot();
	}
	
	private void shoot() {
		System.out.println("우다다다");
	}

	
	

}

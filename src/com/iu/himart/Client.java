package com.iu.himart;

import java.util.Random;

public class Client extends Himart{

	private int money;
	private int point;
	
	public Client() {
		this.money=30000000;//<-같은 클래스 내니까 이렇게 써도 되고
		this.setPoint(10);//<-setter 메서드 사용해도 됨
	}
	
	
	
	public void buy(Tv tv) {
		this.money=this.money-tv.getPrice();
		this.point=this.point+tv.getPoint();
		System.out.println("잔액: "+this.money);
		System.out.println("Point: "+this.point);
			}
	public void buy(Computer computer) {
		this.money=this.money-computer.getPrice();
		this.point=this.point+computer.getPoint();
		System.out.println("잔액: "+this.money);
		System.out.println("Point: "+this.point);
			}
	
	public void buy(Phone phone) {
		this.money=this.money-phone.getPrice();
		this.point=this.point+phone.getPoint();
		System.out.println("잔액: "+this.money);
		System.out.println("Point: "+this.point);
			}
	
	
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
}

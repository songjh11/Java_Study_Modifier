package com.iu.animal;

public class Human {
	
	public int age;
	
	public void setAge(int age) {//메서드 명이 set이면 데이타를 집어넣겠다는 뜻
		this.age = 0;
		if(age>=0&&age<150) {
			this.age=age;
		}
//		if(age>=0&&age<150) {
//			this.age = age;
//		} else {
//			this.age=0;
//		}
	}
	
	public int getAge() {//메서드 명이 get이면 데이타를 꺼내오겠다는 뜻
		return this.age;
	}
	
	public void info() {
		System.out.println(this.age);
	}
	
	
	public void myPet() {
//		Cat cat = new Cat();
//		cat.age=10;
//		cat.sound();
	}

}

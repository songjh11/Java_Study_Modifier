package com.iu.animal;

public class Cat {
//클래스명이 public이기 때문에 다른곳에서 사용 가능하지만 메서드가 default라면 메서드는 사용 불가함

	private int age;//private 지정자는 같은 클래스에서만 사용 가능
	
	public void sound() {
		System.out.println("야옹");
	}
	
	private Cat() {
		
	}
}

package com.iu.main;

import com.iu.animal.Cat;
import com.iu.animal.Human;
import com.iu.animal.Zoo;

public class Main {

	public static void main(String[] args) {
//		Cat cat = new Cat();
		
//		cat.sound();
		
		//cat.age = 5;
		
		Human human = new Human();
		
//		human.age=500;
		human.setAge(100);
		human.info();//메서드를 통해서 접근
		human.getAge();
		//-----------------------------------------------
		System.out.println(Zoo.title);
		Zoo.info();
		
		Zoo zoo = new Zoo();
//		zoo.price=10000;<-final은 변경이 안되고 에러남

	}

}

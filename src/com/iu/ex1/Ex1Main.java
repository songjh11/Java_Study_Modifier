package com.iu.ex1;

public class Ex1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//싱글톤
	
		
		Iu iu=Iu.getInstance();
		
		
		
		iu.setName("IU");
		iu.setAge(27);
		String name = iu.getName();
		int age = iu.getAge();
		System.out.println(iu);
		
		System.out.println(name);
		System.out.println(iu.getAge());
		System.out.println("====================================");
		Iu iu2 = Iu.getInstance();
		System.out.println(iu.getName());
		System.out.println(iu.getAge());
		System.out.println(iu2);//->객체는 하나만 생성됨
		

	}

}

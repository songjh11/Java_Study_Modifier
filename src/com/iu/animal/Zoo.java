package com.iu.animal;

public class Zoo {
		//멤버 변수
		//접근 지정자 [그 외 지정자] 데이터타입 변수명;
		//클래스 변수		
			public static String title="사파리";//<-static변수는 기울어짐
			
		//인스턴스 변수->객체를 만들어야 쓸 수 있는 변수
			public final int price = 500000;
			
	
		//멤버메서드 선언
		//접근 지정자 [그 외 지정자] 리턴 타입 메서드명([매개변수 선언]){}
		//클래스 메서드
			public static void info () {
				System.out.println("Static Method");
				System.out.println(Zoo.title);
//				System.out.println(price);->static 타입이 아니라서 에러가 뜸
			}
		//인스턴스 메서드->객체를 만들어야 쓸 수 있는 메서드
			public void getPrice() {
				System.out.println(price);
				System.out.println(Zoo.title);
				
			}
			
			
}

package com.iu.ex1;

public class Iu {

	private String name;//->객체 생성 후 사용 가능, 객체가 만들어질수도 아닐수도 있기 때문에 사용이 어렵다 
	private int age;
	
	private Iu () {//->생성자 생성,
		
	}
	
	private static Iu iu=null;//객체 생성 전까지 주소값은 null
	
	public static Iu getInstance() {
		if(Iu.iu==null) {
			Iu.iu=new Iu();
		}
		return Iu.iu;
			}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//setter메서드 기본 형식
	//public void set변수명(매개변수(=데이터타입 변수명)){}
	
	//getter메서드 기본 형식
	//public 리턴 타입 get변수명(){return 변수;} 
}

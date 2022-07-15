package com.iu.main;

import com.iu.util.CollectionStack;

public class Main {

	public static void main(String[] args) {
		//1. com.iu.util.CollectionStack->클래스 생성
			//add - 새로운 숫자 추가(아무거나) 무조건 0번 인덱스 위치에
			//remove - 0번 인덱스를 삭제
		//2.com.iu.util.CollectionQue->클래스 생성
			//add - 새로운 숫자 추가(아무거나) 무조건 0번 인덱스 위치에
			//remove - 마지막 순서 인덱스를 삭제
		//3.com.iu.util.CollectionSet->클래스 생성
			//add - 새로운 숫자 추가(아무거나) 무조건 마지막 인덱스 위치에
					//단, 중복되지 않는 숫자만 추가
			//remove - 삭제할 숫자를 입력 받아서 일치하는 숫자 삭제
		
	 CollectionStack cs1 = new CollectionStack(); 
	 
	 int [] numbers = null;
	 
	 cs1.add(numbers);
		for(int i=0; i<cs1.getNumbers().length; i++) {
			System.out.println(cs1.getNumbers()[i]);
				}
		
	}

	

}

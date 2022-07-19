package com.iu.main;

import com.iu.util.CollectionQue;
import com.iu.util.CollectionSet;
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
	 CollectionQue cq2 = new CollectionQue();
	 CollectionSet cs3 = new CollectionSet();
	 	 
	int [] nums = {1,2,3};
	String name = "test";
	char ch = name.charAt(3);
	System.out.println(ch);
	
	
		System.out.println("====================================");
//	int [] numbers = cs1.add(nums);
//		for(int i=0; i<numbers.length; i++) {
//			System.out.println(numbers[i]);
//				}
//		System.out.println("====================================");
//	int [] numbers2 = cs1.remove(nums);
//			for(int i=0; i<numbers2.length; i++) {
//				System.out.println(numbers2[i]);
//					}
//		System.out.println("====================================");			
//		 nums = cs1.add(nums);
//			for(int i=0; i<nums.length; i++) {
//				System.out.println(nums[i]);
//					}
//		System.out.println("====================================");
//		 nums = cs1.remove(nums);
//			for(int i=0; i<nums.length; i++) {
//				System.out.println(nums[i]);
//					}
//		System.out.println("====================================");
	
		int [] numbers3 = cq2.add(nums);
		for(int i=0; i<numbers3.length; i++) {
			System.out.println(numbers3[i]);
				}
		
		System.out.println("====================================");
		
		int [] numbers4 = cq2.remove(nums);
		for(int i=0; i<numbers4.length; i++) {
			System.out.println(numbers4[i]);
				}
		
		System.out.println("====================================");
		
		int [] numbers5 = cs3.add(nums);
		for(int i=0; i<numbers5.length; i++) {
			System.out.println(numbers5[i]);
				}
		
		System.out.println("====================================");
	
		
	
	
	}

	

}

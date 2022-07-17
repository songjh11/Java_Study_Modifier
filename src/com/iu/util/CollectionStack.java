package com.iu.util;

import java.util.Scanner;

public class CollectionStack implements Collection {

	 int [] numbers = {1, 2, 3};  
	
	 int [] numbers2 = null;
	
	Scanner sc = new Scanner (System.in);
		
//	public int[] getNumbers() {
//		return numbers;
//	}
//
//	public void setNumbers(int[] numbers) {
//		this.numbers = numbers;
//	}
//
//	public int[] getNumbers2() {
//		return numbers2;
//	}
//
//	public void setNumbers2(int[] numbers2) {
//		this.numbers2 = numbers2;
//	}

	public int[] add(int[] numbers) {
		numbers2 = new int [numbers.length+1];
		for(int i=0; i<numbers.length; i++) {
			numbers2[i+1] = numbers[i];
		}
		System.out.println("숫자 입력"); 
		numbers2[0]=sc.nextInt();
		numbers=numbers2;
		return numbers;
			}
	
	public int[] remove(int[] numbers) {
		numbers2 = new int [numbers.length-1];
		for(int i=0; i<numbers.length-1; i++) {
			numbers2[i] = numbers[i+1];
		}
			numbers=numbers2;
			return numbers;
	}
	
}

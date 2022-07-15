package com.iu.util;

import java.util.Random;

public class CollectionStack implements Collection {

	 int [] numbers = {1, 2, 3};  
	
	 int [] numbers2 = null;
	
	Random random = new Random();
		
	public int[] getNumbers() {
		return numbers;
	}

	public void setNumbers(int[] numbers) {
		this.numbers = numbers;
	}

	public int[] getNumbers2() {
		return numbers2;
	}

	public void setNumbers2(int[] numbers2) {
		this.numbers2 = numbers2;
	}

	public int[] add(int[] numbers) {
		int num = random.nextInt();
		numbers2 = new int [numbers.length+1];
		int j=0;
		for(int i=1; i<numbers.length; i++) {
			numbers2[i] = numbers[j];
		}
		numbers2[0]=num;
		numbers=numbers2;
		return numbers;
			}
	
	public int[] remove(int[] numbers) {
			return numbers;
	}
	
}

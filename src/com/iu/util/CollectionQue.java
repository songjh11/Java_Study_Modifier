package com.iu.util;

import java.util.Scanner;

public class CollectionQue implements Collection {
	
    int [] numbers2 = null;
	
	Scanner sc = new Scanner (System.in);
	
	public int[] add(int[] nums) {
		numbers2 = new int [nums.length+1];		
		for(int i=0; i<nums.length; i++) {
			numbers2[i+1]=nums[i];
		}
			System.out.println("숫자 입력");
			int num = sc.nextInt();
			numbers2[0]=num;
			nums=numbers2;
			return nums;		
	}
	
	public int[] remove(int[] numbers) {
		numbers2= new int [numbers.length-1];
				for(int i=0; i<numbers.length-1; i++) {
					numbers2[i]=numbers[i];
					}
				numbers=numbers2;
		return numbers;
	}
}

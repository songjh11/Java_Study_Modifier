package com.iu.util;

import java.util.Scanner;

public class CollectionSet implements Collection {
	
	 int [] numbers = {1, 2, 3};  
		
	 int [] numbers2 = null;
	 boolean check = true;
	 int count = 0;
	 int num = 0;
	
	Scanner sc = new Scanner (System.in);

	public int[] add(int[] numbers) {
		numbers2=new int [numbers.length+1];
		while(check){
		System.out.println("숫자 입력");
		this.num = sc.nextInt();
		for(int i=0; i<numbers.length; i++){
			numbers2[i]=numbers[i];}
			for(int i=0; i<numbers.length; i++){	
			if(num==numbers[i]){
				continue;}
				else {
					count++;}
			}
		if(count!=0) {
		numbers2[numbers2.length-1]=this.num;
		numbers=numbers2;
		check=!check;
		break;}
		}
		return numbers;
		}
			
	
	
	public int[] remove(int[] numbers) {
		
		
		return numbers;
	}
	
}

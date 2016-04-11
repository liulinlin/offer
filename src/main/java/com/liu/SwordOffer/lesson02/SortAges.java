package com.liu.SwordOffer.lesson02;

public class SortAges {

	public static void sortAges(int [] ages){
		int oldestAge = 99;
		int [] timesOfAge = null ;
		
//		构建次数数组
		for(int i= 0;i<oldestAge+1;i++){
			timesOfAge[i] = 0;
		}
//		构建出每一个年龄值的次数
		for(int t=0;t<ages.length;t++){
			int age = ages[t];
			if(age <0 || age>oldestAge){
				System.out.println("超出最大年龄限制");
				continue;
			}
			timesOfAge[age]++;
		}
		
//		按顺序输入
		int index = 0;
		for (int i = 0; i < oldestAge; i++) {
			for (int j = 0; j < timesOfAge.length; j++) {
				ages[index] = i;
				++index;
			}
		}
		
//		打印
		for (int i = 0; i < ages.length; i++) {
			System.out.print(ages[i]+"  ");
		}
	}
}

package com.liu.leetcode;

public class NumberOf1Bits {
	/**
	 * n 超出Interger范围时 也要进行计算。无符号 的应该转化成long类型的
	 * */
	public static int hammingWeight(int n) {
		if(n > Integer.MAX_VALUE )return -1;
		int number = 0;
		int flag ;
		while(n != 0 && n!= 1){
			flag = n% 2;
			if (flag ==1) {
				number++;
			}
			n = n/2;
		}
		if (n ==1) {
			number++;
		}
		return number;
	}
}

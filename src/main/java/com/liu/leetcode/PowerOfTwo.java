package com.liu.leetcode;

public class PowerOfTwo {
	/**
	 * 大神解答：
	 * return n<=0?false:((n&(n-1))==0)?true:false;
	 * return n > 0 && (n&(n-1)) == 0;
	 * 
	 * */
	public static boolean isPowerOfTwo(int n) {
		if(n == 0 )return false;
		while(n%2 == 0)n = n/2;
		return n == 1;

	}
}

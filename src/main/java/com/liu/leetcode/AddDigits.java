package com.liu.leetcode;

public class AddDigits {
	public static int addDigits(int num) {
		if (num <= 0) {
			return 0;
		}
		if (num >= Integer.MAX_VALUE) {
			return 0;
		}
		return num - 9 * ((num-1) /9 );
	}
}

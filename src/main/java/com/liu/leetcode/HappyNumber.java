package com.liu.leetcode;

public class HappyNumber {
	public static boolean isHappy(int n) {
		if (n == 1)
			return true;
		int num = 0;
		char[] numbers = (n + "").toCharArray();
		while (num != 1 && num != 4) {
			num = 0;
			for (int i = 0; i < numbers.length; i++) {
				num += (numbers[i] - '0') * (numbers[i] - '0');
			}
			numbers = (num + "").toCharArray();
		}
		return num == 1;
	}
}

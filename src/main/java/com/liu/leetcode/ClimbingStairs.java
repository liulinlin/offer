package com.liu.leetcode;

public class ClimbingStairs {
	public static int climbStairs(int n) {
		if (n == 1)
			return 1;
		if (n == 2)
			return 2;
		int number = 1;
		int result = 2;
		for (int i = 3; i <= n; i++) {
			result = result + number;
			number = result - number;
		}

		return result;
	}
}

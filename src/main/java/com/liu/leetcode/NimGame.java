package com.liu.leetcode;

public class NimGame {

	public static boolean canWinNim(int n) {

		if (n <= 0)
			return false;
		if(n  >= Integer.MAX_VALUE)
			return true;
		if (n == 1 || n == 2 || n == 3)
			return true;
		if(n % 4 == 0)
			return false;
		return true;
	}
	public static boolean canWinNimBest(int n) {
		return (n%4 != 0);
	}
}

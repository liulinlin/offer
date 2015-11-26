package com.liu.leetcode;

public class PlusOne {
	public static int[] plusOne(int[] digits) {
		if (digits.length == 0) {
			return digits;
		}
		int n = digits.length;
		int[] ans = new int[n + 1];
		int c = 1;
		for (int i = n - 1; i >= 0; i--) {
			ans[i + 1] = (c + digits[i]) % 10;
			c = (c + digits[i]) / 10;
		}
		if (c == 1) {
			ans[0] = 1;
			return ans;
		} else {
			for (int i = 0; i < n; i++) {
				digits[i] = ans[i + 1];
			}
			return digits;
		}

	}
}

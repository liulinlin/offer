package com.liu.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleII {
	/**
	 * 跟1 相同 只不过返回最后一行
	 * 
	 * 大神的做法：
	 * 
	 */
	public static List<Integer> generate(int rowIndex) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		int numRows = rowIndex + 1;
		for (int i = 1; i <= numRows; i++) {
			List<Integer> test = new ArrayList<Integer>();
			for (int j = 0; j < i - 1; j++) {
				if (j == 0) {
					test.add(1);
				} else {
					test.add(result.get(i - 2).get(j) + result.get(i - 2).get(j - 1));
				}
			}
			test.add(1);
			result.add(test);
		}
		return result.get(rowIndex);

		// 大神的做法
//		int k = rowIndex + 1;
//
//		List<Integer> result = new ArrayList<>();
//
//		for (int i = 0; i < k; i++) {
//			result.add(0);
//		}
//
//		for (int i = 1; i < k + 1; i++) {
//			for (int j = k - 1; j > -1; j--) {
//				if (j == k - 1 || j == 0) {
//					result.set(j, 1);
//				} else {
//					result.set(j, result.get(j) + result.get(j - 1));
//				}
//			}
//		}
//		return result;
	}
}

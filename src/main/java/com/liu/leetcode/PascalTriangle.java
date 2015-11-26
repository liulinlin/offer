package com.liu.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
	
	public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		for (int i = 1; i <= numRows; i++) {
			List<Integer> test = new ArrayList<Integer>();
			for (int j = 0; j < i-1; j++) {
				if (j == 0) {
					test.add(1);
				} else {
					test.add(result.get(i - 2).get(j) + result.get(i - 2).get(j - 1));
				}
			}
			test.add(1);
			result.add(test);
		}
		return result;
	}
}

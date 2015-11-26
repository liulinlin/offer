package com.liu.leetcode;

public class RemoveElement {
	public int removeElement(int[] nums, int val) {
		int length = nums.length;
		int i = 0;
		while (i < length) {
			if (nums[i] == val) {
				if (i != length - 1) {
					nums[i] = nums[length - 1];
				}
				length--;
			} else {
				i++;
			}
		}
		return length;
	}
}

package com.liu.leetcode;

public class MoveZeroes {
	/*
	 * 总结：
	 * 1  一开始的时候忽视了  要跟  0 交换的 是 找到的0 之后的非0 数据 ，导致 test3（） 没有通过
	 * 2  整体思路 是这样的：先找到第一个0，然后 在找到的第一个0 之后开始找非0的数据，然后做交换
	 * 3 
	 * */
	public static int[] moveZeroes(int[] nums) {
		if (nums == null || nums.length == 0) {
			return null;
		}
		int i = 0, j = 0, temp = 0;
		while (i < nums.length && j < nums.length) {
			while (i < nums.length && nums[i] != 0)
				i++;
			j = i;
			while (j < nums.length && nums[j] == 0)
				j++;
			while (i < nums.length && j < nums.length) {
				temp = nums[j];
				nums[j] = nums[i];
				nums[i] = temp;
				break;
			}
			i++;
			j++;
		}
		return nums;
	}
}

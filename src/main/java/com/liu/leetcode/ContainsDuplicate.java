package com.liu.leetcode;

import java.util.Arrays;


public class ContainsDuplicate {
	public boolean containsDuplicate(int[] nums) {
		if(nums == null || nums.length == 0){
			return false;
		}
		boolean Flog = false;
		Arrays.sort(nums);
		for(int i = 1;i<nums.length;i++){
			if(nums[i-1] == nums[i]){
				Flog = true;
				break;
			}
		}
		return Flog;
	}
}

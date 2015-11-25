package com.liu.leetcode;

public class MajorityElement {
	public static int majorityElement(int[] nums) {
		int Flag = nums[0];
		int FlagNumber = 1;
		for(int i = 1;i<nums.length;i++)
		{
			if(nums[i] == Flag){
				FlagNumber++;
			}else{
				FlagNumber--;
			}
			if(FlagNumber == 0){
				Flag = nums[i];
				FlagNumber = 1;
			}
		}
		FlagNumber = 0;
		for (int j = 0; j < nums.length; j++) {
			if(Flag == nums[j]){
				FlagNumber++;
			}
		}
		
		if(FlagNumber > nums.length/2){
			return Flag;
		}else{
			return 0;
		}
	}
}

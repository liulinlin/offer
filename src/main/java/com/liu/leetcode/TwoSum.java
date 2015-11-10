package com.liu.leetcode;

public class TwoSum {

	
	
	public static void main(String[] args) {
		int [] test = {3,2,4};
		int [] result = twoSum(test,6);
		
		System.out.println(result[0]+"+++++++++"+result[1]);
	}
	 public static int[] twoSum(int[] nums, int target) {
	        int [] result = new int [2];
	        if(nums.length == 0){
	            return result;
	        }
	        for(int i =0;i<nums.length;i++){
	            int test = target - nums[i];
	            for(int j =i+1;j<nums.length;j++){
	                if(test == nums[j]){
	                    result[0] = i+1;
	                    result[1] = j+1;
	                    return result;
	                }
	            }
	        }
	        return result;
	    }
}

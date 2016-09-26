package com.liu.leetcode;

/**
 * @author liulinlin1 on 2016/9/26.
 *         <p>
 *         Given an array of integers, every element appears twice except for one. Find that single one.
 */
public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,3,4,4};
        System.out.println(singleNumber(nums));
    }
    public static int singleNumber(int[] nums) {
        if (nums == null)return 0;
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            result =result^nums[i];
        }
        return  result;
    }
}

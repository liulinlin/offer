package com.liu.leetcode;

/**
 * Created by 刘林林 on 2016/2/24.
 */
public class RotateArray {
    public  int[] Myrotate(int[] nums, int k) {
        int[] temp = new int[nums.length];
        for(int i = k;i<k+nums.length;i++){
            temp[i-k] = nums[i%nums.length];
        }
        nums = temp;
        return nums;
    }
    // 大神做法
    public void reverse(int[] nums,int l,int r){
        while(l<r){
            int temp=nums[l];
            nums[l++]=nums[--r];
            nums[r]=temp;
        }
    }
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        reverse(nums, 0  ,n-k);
        reverse(nums, n-k,n  );
        reverse(nums, 0  ,n  );
    }
}

package com.liu.leetcode;

/**
 * @author: liulinlin@jd.com
 * @since: 2017/1/9
 *
 * Given an integer array nums, find the sum of the elements between indices i and j (i ≤ j), inclusive.

Example:
Given nums = [-2, 0, 3, -5, 2, -1]

sumRange(0, 2) -> 1
sumRange(2, 5) -> -1
sumRange(0, 5) -> -3


 第一印象是 逐个计算 几个数求和，然后就是怎么能够求和快一些，
 第二种想法，
 */
public class RangeSumQuery {

    private  int [] nums ;
    public  RangeSumQuery(int[] nums){
        this.nums = nums;
    }
    public int sumRange(int i, int j) {
        if (i>j) return  0;
        if (i == j ) return  nums[i];

        return 0;
    }
}

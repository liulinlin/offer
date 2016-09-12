package com.liu.leetcode;

import java.util.Arrays;
import java.util.HashSet;

/**
 * 计算是否重复
 */

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length == 0) {
            return false;
        }
        boolean Flog = false;
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == nums[i]) {
                Flog = true;
                break;
            }
        }
        return Flog;
    }

    // 大神做法
    public boolean containsDuplicateT(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) return true;
        }
        return false;
    }
}

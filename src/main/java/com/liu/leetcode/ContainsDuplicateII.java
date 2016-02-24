package com.liu.leetcode;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by 刘林林 on 2016/2/24.
 */
public class ContainsDuplicateII {
    public boolean containsDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> set = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.containsKey(nums[i]) && i-set.get(nums[i])<=k){
                return true;
            }else{
                set.put(nums[i],i);
            }
        }
        return false;
    }
}

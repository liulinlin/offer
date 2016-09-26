package com.liu.leetcode;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author liulinlin1 on 2016/9/26.
 *         <p>
 *         Given two arrays, write a function to compute their intersection.
 *         <p>
 *         Example:
 *         Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].
 *         <p>
 *         Note:
 *         Each element in the result must be unique.
 *         The result can be in any order.
 */
public class IntersectionOfTwoArrays {
    public static void main(String[] args) {

    }

    // java 8 完成
    public static int[] intersection1(int[] nums1, int[] nums2) {
        Set<Integer> set = Arrays.stream(nums2).boxed().collect(Collectors.toSet());
        return Arrays.stream(nums1).distinct().filter(e -> set.contains(e)).toArray();
    }
}

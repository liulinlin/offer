package com.liu.leetcode;

public class FindMedianSortedArrays {
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int Length = nums1.length + nums2.length;
		int[] out = new int[Length];
		int i, j, p;
		p = i = j = 0;

		while (i < nums1.length && j < nums2.length) {
			if (nums1[i] > nums2[j]) {
				if (out[p - 1] != nums2[j]) {
					out[p] = nums2[j];
					p++;
				}
				j++;
			}else
			if (nums1[i] < nums2[j]) {
				if (out[p - 1] != nums2[j]) {
					out[p] = nums1[i];
					p++;
				}
				i++;
			}else
			if (nums1[i] == nums2[j]) {
				if(p-1 == -1){
					out[p] = nums1[j];
					p++;
				}else if(out[p - 1] != nums2[j]) {
					out[p] = nums1[j];
					p++;
				}
				i++;
				j++;
				Length--;
			}

		}
		if (i < nums1.length) {
			for (; i < nums1.length; i++) {
				out[p] = nums1[i];
				p++;
			}
		}
		if (j < nums2.length) {
			for (; j < nums2.length; j++) {
				out[p] = nums2[j];
				p++;
			}
		}

		if (Length % 2 == 0) {
			return (out[Length / 2] + out[Length / 2 - 1]) / 2.0;
		} else {
			return (double) out[Length / 2];
		}
	}
}

package com.liu.leetcode;

import static org.junit.Assert.*;

import org.junit.Test;

public class FindMedianSortedArraysTest {

	@Test
	public void testFindMedianSortedArrays() {
		int [] num1 = {};
		int [] num2 = {1};
		assertEquals(1.0, FindMedianSortedArrays.findMedianSortedArrays(num1, num2));
	}
	@Test
	public void testFindMedianSortedArrays1() {
		int [] num1 = {1,1};
		int [] num2 = {1,2};
		assertEquals(1.5, FindMedianSortedArrays.findMedianSortedArrays(num1, num2));
	}
}

package com.liu.leetcode;

import static org.junit.Assert.*;

import org.junit.Test;

public class MajorityElementTest {

	@Test
	public void test1() {
		int [] nums = {1,2,3,4};
		assertEquals(0, MajorityElement.majorityElement(nums));
	}
	@Test
	public void test2() {
		int [] nums = {1,1,1,4};
		assertEquals(1, MajorityElement.majorityElement(nums));
	}
	@Test
	public void test3() {
		int [] nums = {1};
		assertEquals(1, MajorityElement.majorityElement(nums));
	}
}

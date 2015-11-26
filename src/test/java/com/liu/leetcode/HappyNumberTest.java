package com.liu.leetcode;

import static org.junit.Assert.*;

import org.junit.Test;

public class HappyNumberTest {

	@Test
	public void test1() {
		assertTrue(HappyNumber.isHappy(19));
	}
	@Test
	public void test2() {
		assertFalse(HappyNumber.isHappy(3));
	}
}

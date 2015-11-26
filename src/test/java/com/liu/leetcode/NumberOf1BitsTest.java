package com.liu.leetcode;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumberOf1BitsTest {

	@Test
	public void test1() {
		assertEquals(3, NumberOf1Bits.hammingWeight(11));
	}
	@Test
	public void test2() {
		assertEquals(1, NumberOf1Bits.hammingWeight(+0));
	}

}

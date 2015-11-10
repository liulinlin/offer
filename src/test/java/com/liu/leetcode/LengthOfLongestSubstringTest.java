package com.liu.leetcode;

import static org.junit.Assert.*;

import org.junit.Test;

public class LengthOfLongestSubstringTest {

	@Test
	public void testLengthOfLongestSubstring() {
		assertEquals(3, LengthOfLongestSubstring.lengthOfLongestSubstring("abcabcbb"));
	}
	@Test
	public void testLengthOfLongestSubstring2() {
		assertEquals(2, LengthOfLongestSubstring.lengthOfLongestSubstring("bdb"));
	}
	@Test
	public void testLengthOfLongestSubstring3() {
		assertEquals(2, LengthOfLongestSubstring.lengthOfLongestSubstring("au"));
	}
	@Test
	public void testLengthOfLongestSubstring4() {
		assertEquals(1, LengthOfLongestSubstring.lengthOfLongestSubstring("aa"));
	}
}

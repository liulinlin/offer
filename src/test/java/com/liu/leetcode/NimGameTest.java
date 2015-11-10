package com.liu.leetcode;

import static org.junit.Assert.*;

import org.junit.Test;

public class NimGameTest {

	@Test
	public void test() {
		assertEquals(true, NimGame.canWinNim(2147483647));
	}
	public void test2() {
		assertEquals(true, NimGame.canWinNimBest(2147483647));
	}

}

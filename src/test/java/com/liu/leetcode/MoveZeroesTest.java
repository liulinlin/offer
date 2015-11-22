package com.liu.leetcode;

import static org.junit.Assert.*;

import org.junit.Test;

public class MoveZeroesTest {

	@Test
	public void test1() {
		int [] except= {1,0};
		int [] input= {1,0};
		assertArrayEquals(except, MoveZeroes.moveZeroes(input));
	}
	@Test
	public void test2() {
		int [] except= {1,3,12,0,0};
		int [] input= {0, 1, 0, 3, 12};
		assertArrayEquals(except, MoveZeroes.moveZeroes(input));
	}
	@Test
	public void test3() {
		int [] input= {1,0,1};
		int [] except= {1,1,0};
		assertArrayEquals(except, MoveZeroes.moveZeroes(input));
	}
}

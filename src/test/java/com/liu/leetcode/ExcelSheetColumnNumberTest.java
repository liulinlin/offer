package com.liu.leetcode;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExcelSheetColumnNumberTest {

	@Test
	public void test1() {
		assertEquals(1, ExcelSheetColumnNumber.titleToNumber("A"));
	}
	@Test
	public void test2() {
		assertEquals(27, ExcelSheetColumnNumber.titleToNumber("AA"));
	}

}

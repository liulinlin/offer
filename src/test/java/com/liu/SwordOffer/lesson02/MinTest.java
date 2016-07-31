package com.liu.SwordOffer.lesson02;

import static org.junit.Assert.*;

import com.liu.SwordOffer.Min;
import org.junit.Test;

public class MinTest {

	@Test
	public void test() {
		int [] numbers= {3,4,5,1,2};
		int [] numbers2= {5,6,7,8,9,1,2,3,4};
		assertEquals(1, Min.FoundMinInt(numbers));
		assertEquals(1, Min.FoundMinInt(numbers2));
	}
	@Test
	public void test2() {
		int [] numbers= {5,6,7,8,9,1,2,3,4};
		assertEquals(1, Min.FoundMinInt(numbers));
	}
	@Test
	public void test3() {
		int [] numbers= {1,1,1,1,1,1,0,1,1};
		assertEquals(0, Min.FoundMinInt(numbers));
	}
}

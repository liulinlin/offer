package com.liu.SwordOffer.lesson01;

import com.liu.SwordOffer.orderedArrayFound;
import org.junit.Test;

import junit.framework.Assert;

public class test3Test {

	@Test
	public void test() {
		int [][] array = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
		Assert.assertTrue(new orderedArrayFound().Find(array, 4, 4, 4));
	}

}

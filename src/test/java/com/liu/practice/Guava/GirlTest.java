package com.liu.practice.Guava;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by 刘林林 on 2016/3/5.
 */
public class GirlTest {

    @Test
    public void testCompareTo() throws Exception {
        Girl g1 = new Girl("lisa", 175.00, "nice");
        Girl g2 = new Girl("lisa", 175.00, "beauty");
        //两个girl的face不相同
        System.out.println(g1.compareTo(g2) == 0);//false
    }
}
package com.liu.leetcode;

public class PowerOfTwo {

    public static boolean isPowerOfTwo(int n) {
        if (n == 0) return false;
        while (n % 2 == 0) n = n / 2;
        return n == 1;
    }

    /**
     * 大神解答：
     */
    public static boolean isPowerOfTwo1(int n) {
        return n <= 0 ? false : ((n & (n - 1)) == 0) ? true : false;
    }

    /**
     * 大神解答：
     */
    public static boolean isPowerOfTwo2(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}

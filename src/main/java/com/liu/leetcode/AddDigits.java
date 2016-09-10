package com.liu.leetcode;

public class AddDigits {
    public static void main(String[] args) {
        System.out.println(addDigits(110111));
    }

    /**
     * 记录有多少个1
     * @param num 数
     * @return  个数
     */
    public static int addDigits(int num) {
        if (num <= 0) {
            return 0;
        }
        if (num >= Integer.MAX_VALUE) {
            return 0;
        }
        return num - 9 * ((num - 1) / 9);
    }
}

package com.liu.leetcode;

/**
 * <p>
 * Given an integer (signed 32 bits), write a function to check whether it is a power of 4.
 * Example:
 * Given num = 16, return true. Given num = 5, return false.
 *
 * @author liulinlin1
 * @since：2016/10/12
 */
public class PowerOfFour {
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(0x55555555));
//        System.out.println(isPowerOfFour(0));
//        System.out.println(isPowerOfFour(1));
//        System.out.println(isPowerOfFour(2));
//        System.out.println(isPowerOfFour(16));
    }

    public static boolean isPowerOfFour(int num) {
        if (num <= 0) return false;
        while (num != 0 && num != 1) {
            if ((num & 3) != 0) return false;
            else
                num >>= 2;
        }
        return true;
    }
    public static boolean isPowerOfFour2(int num) {
        return  num>0 && (num&(num-1)) == 0 && (Integer.toBinaryString(num).length()&1) ==1;
    }

    public static  boolean isPowerOfFour1(int num){
        return num > 0 && (num&(num-1)) == 0 && (num & 0x55555555) != 0;
    }
}

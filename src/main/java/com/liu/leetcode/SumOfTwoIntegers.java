package com.liu.leetcode;

/**
 * @author liulinlin1 on 2016/9/26.
 *         <p>
 *         Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.
 *         <p>
 *         Example:
 *         Given a = 1 and b = 2, return 3.
 */
public class SumOfTwoIntegers {
    public static void main(String[] args) {
        System.out.println(getSum4(1, 2));
    }

    // 大神做法
    // 模拟二进制加法，包含进位
    public static int getSum(int a, int b) {
        int sum = 0, carry = 0, result = 0;
        for (int i = 0; i < 32; i++) {
            sum = (a & 1) ^ (b & 1) ^ carry; //calculate sum
            carry = (((a & 1) ^ (b & 1)) & carry) | ((a & 1) & (b & 1)); //calculate carry
            a >>= 1;
            b >>= 1;
            result |= sum << i; //put sum into result
            if (a == 0 && b == 0 && carry == 0) break;//early exit
        }
        return result;
    }

    public static int getSum2(int a, int b) {
        for (; b != 0; b <<= 1) {
            int tmp = a ^ b;
            b = a & b;
            a = tmp;
        }
        return a;
    }

    public static int getSum3(int a, int b) {
        while ((a & b) != 0x00) {//check carry bit
            final int x = (a & b) << 1;//same bit has carry
            final int y = (a ^ b);     //different bit
            a = x;
            b = y;
        }
        return a | b;
    }

    public static int getSum4(int a, int b) {
        while (b != 0) {
            a = a ^ b;
            b = (b ^ a & b) << 1;
        }
        return a;
    }
}

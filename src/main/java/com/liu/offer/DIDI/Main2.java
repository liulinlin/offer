package com.liu.offer.DIDI;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int length = cin.nextInt();
        int data[] = new int[length];
        for (int i = 0; i < length; i++) {
            data[i] = cin.nextInt();
        }
        System.out.println(getMax(data));
    }

    private static long getMax(long a, long b) {
        return a > b ? a : b;
    }

    public static Long getMax(int[] array) {
        if (array == null || array.length <= 0) {
            return null;
        }
        long maxSum = array[0];
        long righteEdge = array[0];
        for (int i = 1; i < array.length; i++) {
            if (righteEdge < 0) {
                righteEdge = array[i];
            } else {
                righteEdge += array[i];
            }
            maxSum = getMax(righteEdge, maxSum);
        }
        return maxSum;
    }
}

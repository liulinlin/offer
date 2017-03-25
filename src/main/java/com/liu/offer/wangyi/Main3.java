package com.liu.offer.wangyi;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by liulinlin on 2017/3/25.
 * 魔力手环
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            int k = in.nextInt();
            int data[] = new int[n];
            for (int i = 0; i < n; i++) {
                data[i] = in.nextInt();
            }
            for (int i = 0; i < k; i++) {
                data = getValue(data);
            }
            System.out.println(Arrays.toString(data).replace("[", "").replace("]", "").replaceAll(",", ""));
        }
    }

    private static int[] getValue(int[] data) {
        int dataCopy[] = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            dataCopy[i] = (data[i] + data[(i + 1) % data.length]) % 100;
        }
        return dataCopy;
    }
}

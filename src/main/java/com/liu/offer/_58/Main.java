package com.liu.offer._58;

import java.util.Scanner;

/**
 * Created by liulinlin on 2017/3/23.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            getValue(in.nextInt());
        }
    }

    public static void getValue(int data) {
        String s = String.valueOf(data);
        int R = 1;
        for (int i = 0; i < s.length(); i++) {
            R = R * (s.charAt(i) - '0');
        }
        int r = (int) Math.sqrt((double) R);
        if (r * r == R) System.out.println("YES");
        else System.out.println("NO");
    }
}

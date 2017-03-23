package com.liu.offer._58;

import java.util.Scanner;

/**
 * Created by liulinlin on 2017/3/23.
 * 平衡数问题：1221,100,1236 1236 可以拆成1*2*3==6  1*2==2*1 1*0 == 0
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
        int result = 1;
        int countOf0 = 0;
        for (int i = 0; i < s.length(); i++) {
            int l = s.charAt(i) - '0';
            if (l == 0) countOf0++;
            result = result * l;
        }
        if (countOf0 == 1) {
            System.out.println("NO");
            return;
        }
        if (countOf0 > 1) {
            System.out.println("YES");
            return;
        }
        int r = (int) Math.sqrt((double) result);
        if (r * r == result) System.out.println("YES");
        else System.out.println("NO");
    }
}

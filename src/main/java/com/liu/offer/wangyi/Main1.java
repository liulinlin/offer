package com.liu.offer.wangyi;

import java.util.Scanner;

/**
 * Created by liulinlin on 2017/3/25.
 *
 * 计算坐标时间
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            int[] tx = new int[n];
            int[] ty = new int[n];
            for (int i = 0; i < n; i++) {
                tx[i] = in.nextInt();
            }
            for (int i = 0; i < n; i++) {
                ty[i] = in.nextInt();
            }
            int gx = in.nextInt();
            int gy = in.nextInt();
            int walktime = in.nextInt();
            int taxitime = in.nextInt();

            System.out.println(getValue(tx, ty, gx, gy, walktime, taxitime));
        }
    }

    public static int getValue(int[] tx, int[] ty, int gx, int gy, int walktime, int taxitime) {
        int walk = (Math.abs(gx) + Math.abs(gy)) * walktime;
        int taxi = Integer.MAX_VALUE;
        for (int i = 0; i < tx.length; i++) {
            int twalk = (Math.abs(tx[i]) + Math.abs(ty[i])) * walktime;
            int ttaxi = (Math.abs(tx[i] - gx) + Math.abs(ty[i] - gy)) * taxitime;
            taxi = Math.min(ttaxi + twalk, taxi);
        }
        return Math.min(taxi, walk);
    }
}

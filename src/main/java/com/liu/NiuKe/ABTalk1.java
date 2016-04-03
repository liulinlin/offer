package com.liu.NiuKe;

import java.util.Scanner;
public class ABTalk1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int p = in.nextInt();
            int q = in.nextInt();
            int l = in.nextInt();
            int r = in.nextInt();

            int[][] dataA = new int[p][2];
            int[][] dataB = new int[q][2];
            for (int i = 0; i < p; i++) {
                dataA[i][0] = in.nextInt();
                dataA[i][1] = in.nextInt();
            }
            for (int i = 0; i < q; i++) {
                dataB[i][0] = in.nextInt();
                dataB[i][1] = in.nextInt();
            }

            int count = 0;
            int maxFull = Integer.MIN_VALUE;
            for (int i = 0; i < p; i++) {
                for (int j = 0; j < q; j++) {
                    maxFull = Math.max(maxFull, dataA[i][1] - dataB[j][0]);
                }
            }
            if (maxFull < l) {
                count = 0;
            } else if (maxFull < r) {
                count = maxFull - l;
                if (l!= 0)
                    count++;
            } else {
                count = r - l;
                if (l!= 0)
                    count++;
            }
            System.out.println(count);
        }
    }
}

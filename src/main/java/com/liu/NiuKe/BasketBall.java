package com.liu.NiuKe;

import java.util.Scanner;
public class BasketBall {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int p = in.nextInt();
            int n = in.nextInt();

            int basketball[] = new int[n];
            for (int i = 0; i < n; i++) {
                basketball[i] = in.nextInt();
            }
            int baskets[] = new int[p];
            for (int k = 0; k < p; k++) {
                baskets[k] = -1;
            }
            int count = -1;
            for (int j = 0; j < n; j++) {
                int index = basketball[j] % p;
                if (baskets[index] == -1) {
                    baskets[index] = 0;
                } else {
                    count = j+1;
                    break;
                }
            }
           System.out.println(count);
        }
    }
}

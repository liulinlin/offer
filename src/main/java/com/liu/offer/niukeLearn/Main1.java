package com.liu.offer.niukeLearn;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int N = in.nextInt();
            int L = in.nextInt();
            boolean success = false;
            for (int i = 2; i < N&&i<=100; i++) {
                int a1 = getA(N, i);
                if (a1 == -1)continue;
                if (a1 >= L) {
                    String result = a1 + " ";
                    for (int j = 1; j < i; j++) {
                        result = result + (a1 + j) + " ";
                    }
                    System.out.println(result.substring(0, result.length() - 1));
                    success = true;
                    break;
                }
            }
            if (!success) System.out.println("No");
        }
    }

    public static int getA(int Sn, int n) {
        int L = (Sn - (n * (n - 1)) / 2);
        if (L % n == 0) return L / n;
        return -1;
    }
}

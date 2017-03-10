package com.liu.offer.niukeLearn;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            long n = in.nextLong();
            List<Integer> sushus = getSushu(n);
            boolean find = false;
            for (Integer i :sushus){
                long f = n;
                int q = 0;
                while (f>1){
                    if (f%i == 0){
                        f = f/i;
                        q++;
                    }else{
                        break;
                    }
                }
                if (f == 1){
                    System.out.println(i+" "+q);
                    find = true;
                    break;
                }
            }
            if (!find){
                System.out.println("No");
            }
        }

    }

    public static List<Integer> getSushu(long n) {
        long a = (long) Math.sqrt(n);
        return getS(a);
    }

    private static List<Integer> getS(long a) {
        List<Integer> result = new ArrayList<>();
        for (int i = 2; i <= a; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) result.add(i);
        }
        return result;
    }
}

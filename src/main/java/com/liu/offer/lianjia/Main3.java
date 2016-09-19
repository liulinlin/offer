package com.liu.offer.lianjia;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            if (n>=1&&n<=45){
                int[] result = getResult(n);
                System.out.println(result[0] + " " + result[1]);
            }else {
                System.out.println("1 0");
            }
        }
    }
    public static int[] getResult(final int n) {
        int[] result = new int[2];
        result[0] = 1;
        result[1] = 0;
        if (n == 1)return result;
        for (int i = 1; i <=n; i++) {
            int temp = result[0]+result[1];
            result[0] = result[1];
            result[1] = temp;
        }
        return  result;
    }
}

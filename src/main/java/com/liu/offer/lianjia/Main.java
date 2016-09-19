package com.liu.offer.lianjia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            int[] result = getResult(n);
            System.out.println(result[0] + " " + result[1]);
        }
    }

    public static int[] getResult(final int n) {
        int[] result = new int[2];
        result[0] = 0;
        result[1] = 0;
        StringBuilder oldStr = new StringBuilder("A");
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < oldStr.length(); j++) {
                char t = oldStr.charAt(j);
                if (t == 'A') {
                    newStr.append('B');
                } else {
                    newStr.append("BA");
                }
            }
            oldStr = newStr;
            newStr = new StringBuilder(oldStr.length()*2);
        }
        for (int i = 0; i < oldStr.length(); i++) {
            if (oldStr.charAt(i) == 'A') {
                result[0]++;
            } else {
                result[1]++;
            }
        }
        return result;
    }
}

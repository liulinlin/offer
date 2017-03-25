package com.liu.offer.wangyi;

import java.util.Scanner;

/**
 * Created by liulinlin on 2017/3/25.
 * GGBBG ->2
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String data = in.next();
            System.out.println(Math.min(getRight(data),getleft(data)));
        }
    }
    private static int getRight(String data){
        int p = 0;
        int step = 0;
        for (int i = 0; i < data.length(); i++) {
            if (data.charAt(i) == 'B'){
                step = step+i-p;
                p++;
            }
        }
        return step;
    }
    private static int getleft(String data){
        int p = data.length()-1;
        int step = 0;
        for (int i = 0; i < data.length(); i++) {
            if (data.charAt(i) == 'B'){
                step = step+p-i;
                p--;
            }
        }
        return step;
    }
}

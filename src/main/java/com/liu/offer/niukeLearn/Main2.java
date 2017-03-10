package com.liu.offer.niukeLearn;

import java.util.Scanner;

/**
 * Created by liulinlin on 2017/3/7.
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int A = in.nextInt();
            int B = in.nextInt();
            int K = in.nextInt();

            int yushu = A%K;
            int count = A/K;
            if (yushu == 0){
                System.out.println(count);
            }else   if (yushu %2 == 0)
            {
                System.out.println(count+2);
            }else  {
                System.out.println(count+3);
            }
        }
    }
}

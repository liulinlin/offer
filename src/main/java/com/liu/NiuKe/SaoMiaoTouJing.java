package com.liu.NiuKe;

import java.util.Scanner;

/**
 * Created by 刘林林 on 2016/4/3.
 */
public class SaoMiaoTouJing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int N = in.nextInt();
            int M = in.nextInt();
            int K = in.nextInt();
            int [][] data = new int[N][M];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                   data[i][j] = 0;
                }
            }
            for (int i = 0; i < K; i++) {
                int x = in.nextInt();
                int y = in.nextInt();
                data[x][y]++;
            }
            if((N<=3&&M<=6)||(M<=3&&N<=6)){
                int sum = 0;
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < M; j++) {
                        sum +=data[i][j];
                    }
                }
            }else {
                boolean [][] mark = new boolean[N][M];
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < M; j++) {
                        mark[i][j]=false;
                    }
                }


            }
        }
    }
}

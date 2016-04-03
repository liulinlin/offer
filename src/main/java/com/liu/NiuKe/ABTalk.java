package com.liu.NiuKe;

import java.util.Scanner;

public class ABTalk {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int p = in.nextInt();
            int q = in.nextInt();
            int l = in.nextInt();
            int r = in.nextInt();

            int[][] dataA = new int[p][2];
            int[][] dataB = new int[q][2];
            for (int i = 0;i<p;i++){
                dataA[i][0] = in.nextInt();
                dataA[i][1] = in.nextInt();
            }
            for (int i = 0;i<q;i++){
                dataB[i][0] = in.nextInt();
                dataB[i][1] = in.nextInt();
            }

            int count = 0;
            boolean flag = false;
            for(int t = l;t <= r;t++){
                int[][] c = new int[q][2];
                for(int i = 0;i < q;i++){
                    c[i][0] = t + dataB[i][0];
                    c[i][1] = t + dataB[i][1];
                }
                for(int i = 0;i < p;i++){
                    if(flag == true)
                        break;
                    for(int j = 0;j < q;j++){
                        if(sol(dataA[i],c[j])){
                            flag = true;
                            break;
                        }
                    }
                }
                if(flag == true){
                    count++;
                }
                flag = false;
            }
            System.out.println(count);

        }
    }
    private static boolean sol(int[] a,int[] b){
        if(a[0] <= b[1] && a[1] >= b[0])
            return true;
        return false;
    }
}

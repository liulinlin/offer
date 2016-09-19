package com.liu.offer.lianjia;

import java.util.Arrays;
import java.util.Scanner;

public class Mian1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int N = in.nextInt();
            int I = in.nextInt();
            int [] [] data = new int[I][2];
            for (int i = 0; i <I; i++) {
                data[i][0] = in.nextInt();
                data[i][1] = in.nextInt();
            }
            int [] result ;
            result = getResult(N,data);
            System.out.println(result[0]+" "+result[1]+" "+result[2]);
        }
    }

    private static int[] getResult(int n, int[][] data) {
        int [] result = new int[3];
        int [] A = new int[data.length];
        for (int i = 0; i <data.length; i++) {
            A[i] = data[i][0];
        }
        Arrays.sort(A);
        if (A.length == 1){
            result[0] = A[0]+1;
            result[1] = A[A.length-1]*2;
            result[2] = A[A.length-1]*3;
        }else if (A.length == 2){
            result[0] = A[0]+1;
            result[1] = A[A.length-1]+A[A.length-2];
            result[2] = A[A.length-1]+A[A.length-1]+A[A.length-2];
        }else {
            result[0] = A[0]+1;
            result[1] = A[A.length-1]+A[A.length-2];
            result[2] = A[A.length-1]+A[A.length-2]+A[A.length-3];
        }


        return result;
    }
}

package com.liu.offer.JD._20160905;

/**
 * 5
 1 2 4 5 3

 7
 */

import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()){
            int length = cin.nextInt();
            int [] data = new int[length];
            for (int i = 0; i < length; i++) {
                data[i] = cin.nextInt();
            }
            int sum = 0;
            int num =0;
            for (int i = 0; i < length; i++) {
                num =0;
                for (int j = i+1; num <length-1 ; j++,num++) {
                    if (data[i]<data[(j+length)%length]){
                        break;
                    }else {
                        sum++;
                    }
                }
                num = 0;
                for (int j = i-1; num < length-1; j--,num++) {
                    if (data[i]<data[(j+length)%5]){
                        break;
                    }else {
                        sum++;
                    }
                }
//              System.out.println("i="+i+" sum="+sum);
            }
            System.out.println(sum/2);
        }
    }
}

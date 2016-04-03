package com.liu.NiuKe;

/**
 * Created by 刘林林 on 2016/4/2.
 */
import java.util.*;
public class MaxSpace {
    // 大神写法 干净利落
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n = in.nextInt(),i;
            int arr[] = new int[n];
            for (i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
            int maxFull = Integer.MIN_VALUE,minMaxGap = Integer.MAX_VALUE;
            for (i = 1; i < n; i++) {
                maxFull = Math.max(maxFull, arr[i]-arr[i-1]);
            }
            for (i = 1; i < n-1; i++) {
                minMaxGap = Math.min(minMaxGap, Math.max(arr[i+1]-arr[i-1], maxFull));
            }
            System.out.println(minMaxGap);
        }
        in.close();
    }
}

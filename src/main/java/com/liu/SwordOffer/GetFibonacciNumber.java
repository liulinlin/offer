package com.liu.SwordOffer;

/**
 * Created by Administrator on 2016/2/26.
 */
public class GetFibonacciNumber {
    public static int SolutionOne(int n){
        if(n<=0)return  0;
        if(n==1)return  1;
        return SolutionOne(n-1) +SolutionOne(n-2);
    }
    public static int SolutionTwo(int n){
        if(n<=0)return  0;
        if(n==1)return  1;
        int fibMin = 0;
        int fibMax = 1;
        int fibN =0;
        for (int i =2;i<=n;i++){
            fibN = fibMax + fibMin;
            fibMin = fibMax;
            fibMax = fibN;
        }
        return fibN;
    }
}

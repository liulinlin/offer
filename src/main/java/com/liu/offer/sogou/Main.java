package com.liu.offer.sogou;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        ArrayList<Integer> data = new ArrayList<>(length);
        ArrayList<Integer> primes = new ArrayList<>(length/2);
        // 收集数据
        for (int i = 0; i <length ; i++) {
            data.add(in.nextInt());
        }
        // 准备质数集
        for (int i = 0; i <data.get(length-1); i++) {
            if (isPrime(i)){
                primes.add(i);
            }
        }
        // 暴力破解
        int count =getCount(data,primes);
        System.out.println(count);
    }
    public static  int getCount(ArrayList<Integer> data,ArrayList<Integer> primes){
        int count = 0;
        for (int i = 0; i <data.size(); i++) {
            for (int j = i+1; j <data.size(); j++) {
                count = count +getCount(data,primes,i,j);
            }
        }
        return  count;
    }
    public static  int getCount(ArrayList<Integer> data,ArrayList<Integer> primes,int i,int j){
        int count = 0;
        for (int k = 0; k <primes.size(); k++) {
            if (primes.get(k)<data.get(i)){
                continue;
            }else if (primes.get(k)>data.get(j)){
                break;
            }else {
                count++;
            }
        }
        return  count;
    }
    public static boolean isPrime(int a) {
        boolean flag = true;
        if (a < 2) {// 素数不小于2
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(a); i++) {
                if (a % i == 0) {// 若能被整除，则说明不是素数，返回false
                    flag = false;
                    break;// 跳出循环
                }
            }
        }
        return flag;
    }
}

package com.liu.offer.Tencent;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        List<Integer> primes = new ArrayList<>();
        // 构建素数列表
        for (int i = 0; i < 1000; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
        Scanner in = new Scanner(System.in);
        int data = in.nextInt();
        int count= getCount(data,primes);
        System.out.println(count);
    }

    public static int getCount(int data ,List<Integer> primes){
        int count = 0;
        for (int i = 0; i <primes.size(); i++) {
            for (int j = i; j <primes.size(); j++) {
                if (primes.get(i)+primes.get(j)==data){
                    count++;
                }
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

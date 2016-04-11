package com.liu.SwordOffer.lesson02;

/**
 * Created by 刘林林 on 2016/2/27.
 */
public class WeiCalculate {
    // 在 java 下 不行 ，因为 java 没有提供 无符号 格式 。
    public  static int NumberOf1_one(int n){
        int count = 0;
        int flag = 1;
        while (flag == 1) {
            if ((n & flag) ==1)
                count++;
            flag = flag<<1;
        }
        return  count;
    }

    // 这个可以运行 但是在遇到负数时 出错
    public  static int NumberOf1_two(int n){
        int count = 0;
        while (n >0) {
            if ((n & 1) ==1)
                count++;
           n= n>>1;
        }
        return  count;
    }

    // 最好的解决方案
    public  static int NumberOf1_thr(int n){
        int count = 0;
        while (n >0) {
            count++;
            n= n&(n-1); // 这个作用就是讲一个数 二进制 中的 1 按照从低到高 依次改为 0； n 值 为 改后的 数
        }
        return  count;
    }
}

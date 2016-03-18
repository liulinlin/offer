package com.liu.practice;

/**
 * Created by 刘林林 on 2016/3/2.
 */
public class Practice {
    public static void main (String [] args){
       int [] tt = {1,2,10,4,5,6,1,2,10,4,5};
        Practice.getSingleNumber(tt);
    }

    public static   void getSingleNumber(int [] array ){
        int x = 0;
        for (int i = 0;i<array.length;i++){
            x ^= array[i];
        }
        System.out.print(x);
    }

}

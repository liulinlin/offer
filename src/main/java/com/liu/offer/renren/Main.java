package com.liu.offer.renren;

import com.alibaba.fastjson.JSON;
import org.apache.commons.collections4.CollectionUtils;

import java.util.*;

/**
 * Created by liulinlin on 2017/3/19.
 */
public class Main {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        while (in.hasNext()){
//            int b = in.nextInt();
//
//        }
    }


    public static int getSum(int data,int b){
        List<Integer> result = new LinkedList<>();
        while (data != 0){
            result.add(data%b);
            data = (data-data%b)/b;
        }
        int sum = 0;
        for (int i = 0; i <result.size(); i++) {
            sum+=result.get(i);
        }
        return sum;
    }
    public static int getDiff(int data,int b){
        List<Integer> result = new LinkedList<>();
        while (data != 0){
            result.add(data%b);
            data = (data-data%b)/b;
        }
        Collections.reverse(result);
        int jiSum = 0;
        int ouSum =0;
        for (int i = 0; i <result.size(); i++) {
            if (i%2==0){
                jiSum+=result.get(i);
            }else{
                ouSum+=result.get(i);
            }
        }
        return Math.abs(jiSum-ouSum);
    }
}

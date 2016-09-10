package com.liu.offer.Meituan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Administrator on 2016/9/10.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> dataList = new ArrayList<>();
        while (in.hasNext()){
            dataList.add(in.nextInt());
        }
        int array []= new int[dataList.size()];
        for (int i = 0; i < dataList.size(); i++) {
            array[i] = dataList.get(i);
        }
        int data [] = getResult(array);
        System.out.println(Arrays.toString(data));
    }

    public static  int [] getResult(int  [] data){
        int [] result = new int [data.length];
        for (int i = 0; i < data.length; i++) {
            int num = 0;
            for (int j = i+1; j < data.length; j++) {
                if (data[j]>data[i]){
                    num++;
                }
            }
            result[i] = num;
            num=0;
        }
        return  result;
    }
}

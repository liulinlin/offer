package com.liu.offer.Tencent;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final List<Integer> result = new ArrayList<>();
        final int data = in.nextInt();
        isP(result,data,-90,90);
        for (int i = 0; i <result.size(); i++) {
            System.out.print(result.get(i));
        }
    }

    public static void isP(List<Integer> result,final int data,int start ,int end){
        if(end-start<6){
            return;
        }else {
            int mid = (start+end)/2;
            if (data>=mid){
                result.add(1);
                isP(result,data,mid,end);
                return;
            }else {
                result.add(0);
                isP(result,data,start,mid);
                return;
            }
        }
    }
}

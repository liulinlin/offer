package com.liu.offer.JD._20160905;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()){
            int numbers = cin.nextInt();
            int buyListLength = cin.nextInt();
            int [] data = new int[numbers];
            for (int i = 0; i <numbers; i++) {
                data[i] = cin.nextInt();
            }
            //排序
            Arrays.sort(data);
            // 得到预购清单
            Map<String,Integer> buyList = new HashMap<>();
            for (int i = 0; i <buyListLength; i++) {
                String str = cin.next();
                if (buyList.containsKey(str)){
                    buyList.put(str,buyList.get(str)+1);
                }else {
                    buyList.put(str,1);
                }
            }
            int buyNum [] = new int[buyList.size()];
            Iterator iterator = buyList.keySet().iterator();
            int i = 0;
            while (iterator.hasNext()){
                int value = buyList.get(iterator.next());
                System.out.println(value);
                buyNum[i] = value;
                i++;
            }
            Arrays.sort(buyNum);
            // 得到结果
            int min =0;
            int max =0;
            for (int j = 0; j <buyNum.length; j++) {
                min = min +data[j]*buyNum[buyNum.length-j-1];
                max = max +data[data.length-j-1]*buyNum[buyNum.length-j-1];
            }
            System.out.println(min+" "+max);
        }
    }
}

package com.liu.NiuKe;

import java.util.Scanner;
public class XiaoMingDaGuai {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            int a = in.nextInt();
            int data[] = new int[n];
            for (int i = 0; i < n; i++) {
                data[i] = in.nextInt();
            }
            for (int i = 0; i < n; i++) {
                if (a<data[i]){
                    a = a+getZuiDaGongYueShu(a,data[i]);
                }else {
                    a = a+ data[i];
                }
            }
            System.out.println(a);
        }
    }
    private static int getZuiDaGongYueShu(int i,int j){
        int result = 1;

        for (int k=1;k<=i&&k<=j;k++){
            if (i%k==0&&j%k==0)
                result = k;
        }
        return  result;
    }
}

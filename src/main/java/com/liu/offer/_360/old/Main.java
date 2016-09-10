package com.liu.offer._360.old;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        ArrayList<int[]> inputList = new ArrayList<int[]>();
        while (true) {
            String getString = cin.nextLine();
            if (getString.trim().length() == 0) {
                break;
            }
            String[] ss = getString.split(" ");
            if (ss.length == 2)
                inputList.add(new int[]{Integer.parseInt(ss[0].trim()), Integer.parseInt(ss[1].trim())});
            else
                System.out.println("输入不符合规定");
        }
        for (int i = 0; i < inputList.size(); i++) {
            System.out.println(getA(inputList.get(i)[0], inputList.get(i)[1]));
        }
    }

    public static int getA(int n, int b) {
        int maxCount = 0;//记录当前最大的胜利次数
        int maxCountA = 0;//记录当前最大的胜利次数对应的a值
        for (int a = 1; a <= n; a++)    //小A选择的数
        {
            if (a == b)  //A和B不能选择相同的数
            {
                continue;
            }
            int count = 0;  //临时记录获胜的次数
            for (int c = 1; c <= n; c++)//此处为c
            {
                if (Math.abs(a - c) < Math.abs(b - c)) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                maxCountA = a;
            }
        }
        return maxCountA;
    }
}

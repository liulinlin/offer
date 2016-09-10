package com.liu.offer._360.old;

import java.util.Scanner;

/**
 * Created by 刘林林 on 2016/3/29.
 */
public class Test {
    public static void main(String args[])
    {
        Scanner cin;
        cin = new Scanner(System.in);
        int a, b;
        while(cin.hasNextInt())
        {
            a = cin.nextInt();
            b = cin.nextInt();
            System.out.println(a + b);
        }
    }
}

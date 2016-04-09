package com.liu.offer.JD;

import java.util.Scanner;
public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            Long a = in.nextLong();
            System.out.println(a*(a+1)/2);
        }
        in.close();
    }
}

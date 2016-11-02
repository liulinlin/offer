package com.liu.offer.qunaer01;

import java.util.Scanner;

public class Main2 {
    public static void main(String args[]) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            String str1 = cin.next();
            String str2 = cin.next();
            System.out.println(isSameChar(str1, str2)&&isSameChar(str2, str1));
        }
    }

    private static boolean isSameChar(String str1, String str2) {
        for (int i = 0; i <str2.length(); i++) {
            if (str1.indexOf(str2.charAt(i))<0)
            {
                return false;
            }
        }
        return true;
    }
}

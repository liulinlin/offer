package com.liu.offer.sogou;

import java.io.Serializable;
import java.util.Scanner;

public class Main1{
    static char [] dataChar;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String data = in.next();
        dataChar = data.toCharArray();
        boolean result = false ;
        int i = dataChar.length-1;
        for (; i >=0; i--) {
            if (dataChar[i] == dataChar[0]){
                result = isHuiWen(i);
            }
            if (result){
                break;
            }
        }
        System.out.println(i+1);
    }
    public static boolean isHuiWen(int i){
        for (int j = 0; j <=i/2 ; j++) {
            if (dataChar[j] != dataChar[i-j]){
                return  false;
            }
        }
        return  true;
    }
}

package com.liu.offer.qunaer01;

import java.util.Scanner;
public class Main1 {
    public static void main(String args[]) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNextInt()) {
            final int i = cin.nextInt();
            int next = i+1;
            while (true){
                if (isDuichen(next)){
                    System.out.println(next);
                    break;
                }
                next++;
            }

        }
    }
    private static boolean isDuichen(int num){
        char [] data = Integer.toString(num).toCharArray();
        int i = 0;
        int j = data.length-1;
        while (i<j){
            if (data[i] != data[j]){
                return  false;
            }
            i++;
            j--;
        }
        return true;
    }
}

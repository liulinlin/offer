package com.liu.leetcode;

/**
 * Created by liulinlin1 on 2016/8/11.
 *
 * 描述 ：
 * Given two binary strings, return their sum (also a binary string).
     For example,
     a = "11"
     b = "1"
     Return "100".
 */
public class AddBinary {

    public static void main(String[] args) {
            String a = "1010";
            String b = "1011";
        System.out.println(addBinary(a,b));
    }

    public static String addBinary(String a, String b) {
        if (a == null || a.trim() == ""){
            return  b;
        }
        if (b == null || b.trim() == ""){
            return  a;
        }
        int aLength = a.length();
        int bLength = b.length();
        int lengthMax = aLength>bLength?aLength:bLength;
        int lengthMin = aLength<bLength?aLength:bLength;
        int  jinwei = 0;
        int [] result = new int[lengthMax+1];
        int i = 0;
        while (i<lengthMin) {
            int temp = Integer.parseInt(a.substring(aLength-i-1,aLength-i))+Integer.parseInt(b.substring(bLength-i-1,bLength-i))+jinwei;
            if (temp <= 1){
                result[lengthMax-i] = temp;
                jinwei = 0;
            }else{
                result[lengthMax-i] = temp-2;
                jinwei = 1;
            }
            i++;
        }
        if (aLength == lengthMin){
            while (i<lengthMax){
                int temp = Integer.parseInt(b.substring(bLength-i-1,bLength-i))+jinwei;
                if (temp <=1){
                    result[lengthMax-i] = temp;
                    jinwei = 0;
                }else{
                    result[lengthMax-i] = temp-2;
                    jinwei = 1;
                }
                i++;
            }
        }else {
            while (i<lengthMax){
                int temp = Integer.parseInt(a.substring(aLength-i-1,aLength-i))+jinwei;
                if (temp <=1){
                    result[lengthMax-i] = temp;
                    jinwei = 0;
                }else{
                    result[lengthMax-i] = temp-2;
                    jinwei = 1;
                }
                i++;
            }
        }
        result[0] = jinwei;
        String retuString = "";
        for (int j = 0; j < result.length; j++) {
            retuString =retuString +result[j];
        }
        if (retuString.startsWith("0")){
            retuString = retuString.substring(1);
        }
        return  retuString;
    }
}

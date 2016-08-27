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

    // MySolution
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

    // other's solution
    public String addBinary1(String a, String b) {
        String temp="";
        if(a.length()<b.length()){
            temp=a;
            a=b;
            b=temp;
        }

        char[] arA=a.toCharArray();
        char[] arB=b.toCharArray();
        char[] arC=new char[a.length()+1];

        int i=a.length()-1;
        int j=b.length()-1;
        int carry=0;
        int tempSum=0;
        while(i>=0){
            if(j>=0){
                tempSum=arA[i]-'0'+arB[j]-'0'+carry;
                --j;
            }
            else{
                tempSum=arA[i]-'0'+carry;
            }
            carry=tempSum/2;
            arC[i+1]=(char)(tempSum%2+48);
            --i;
        }
        arC[i+1]='1';

        if(carry>0){
            return String.valueOf(arC);
        }
        else{
            return String.valueOf(arC).substring(1,a.length()+1);
        }
    }
    public String addBinary2(String a, String b) {
        StringBuilder result = new StringBuilder();
        int sum = 0, carry = 0;
        int i = a.length() - 1, j = b.length() - 1;

        // start from the end
        while(i >= 0 || j >= 0){
            // take the bits
            int bit1 = (i >= 0) ? Integer.parseInt(String.valueOf(a.charAt(i))) : 0;
            int bit2 = (j >= 0) ? Integer.parseInt(String.valueOf(b.charAt(j))) : 0;

            // calculate the sum and the carry
            sum = carry ^ bit1 ^ bit2;
            carry = (carry & bit1) | (carry & bit2) | (bit1 & bit2);

            result.append(String.valueOf(sum));
            i--;
            j--;
        }

        if(carry > 0)
            result.append(String.valueOf(carry));

        return result.reverse().toString();
    }
}

package com.liu.leetcode;

import java.util.Arrays;

/**
 * @author liulinlin1 on 2016/9/26.
 *
 * 通过运行时间对比，说明不引入更多的对象能够大大提高运行时间
 *
 *         <p>
 *         Write a function that takes a string as input and returns the string reversed.
 *         <p>
 *         Example:
 *         Given s = "hello", return "olleh".
 */
public class ReverseString {
    /*
    运行时间4ms
     */
    public String reverseString(String s) {
        if (s == null)
            return "";
        else {
            return new StringBuilder(s).reverse().toString();
        }
    }

    /*
       运行时间4ms
        */
    public String reverseString2(String s) {
        if (s == null)
            return "";
        else if (s.trim().equals("")) {
            return s;
        }
        return new StringBuilder(s).reverse().toString();
    }

    /*
       运行时间2ms
        */
    public String reverseString3(String s) {
        if (s == null) return null;
        if (s.equals("")) return s;
        char[] arrChar = s.toCharArray();
        for (int i = 0, j = arrChar.length - 1; i <= j; i++, j--) {
            char temp = arrChar[i];
            arrChar[i] = arrChar[j];
            arrChar[j] = temp;
        }
        return new String(arrChar);
    }

}

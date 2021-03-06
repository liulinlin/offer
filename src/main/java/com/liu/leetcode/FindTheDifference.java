package com.liu.leetcode;

/**
 * @author liulinlin1 on 2016/9/26.
 *         <p>
 *         Given two strings s and t which consist of only lowercase letters.
 *         <p>
 *         String t is generated by random shuffling string s and then add one more letter at a random position.
 *         <p>
 *         Find the letter that was added in t.
 *         <p>
 *         Example:
 *         <p>
 *         Input:
 *         s = "abcd"
 *         t = "abcde"
 *         <p>
 *         Output:
 *         e
 *         <p>
 *         Explanation:
 *         'e' is the letter that was added.
 */
public class FindTheDifference {
    public static void main(String[] args) {
        System.out.println(findTheDifference("abcd", "abcde"));
    }

    public static char findTheDifference(String s, String t) {
        char[] tData = t.toCharArray();
        char[] sData = s.toCharArray();
        char result = 0;
        for (char ss : sData) {
            result ^= ss;
        }
        for (char tt : tData) {
            result ^= tt;
        }
        return (char) result;
    }

    // 大神做法：将t 最后一个字符默认是多出来的，然后 对两个字符串剩下的字符进行异或运算，最后剩下的就是要求的答案
    public static char findTheDifference2(String s, String t) {
        int n = t.length();
        char c = t.charAt(n - 1);
        for (int i = 0; i < n - 1; ++i) {
            c ^= s.charAt(i);
            c ^= t.charAt(i);
        }
        return c;
    }
}

package com.liu.leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by liulinlin1 on 2016/8/12.
 */
public class RansomNote {
    public static void main(String[] args) {
        String a = "bjaajgea";
        String b = "affhiiicabhbdchbidghccijjbfjfhjeddgggbajhidhjchiedhdibgeaecffbbbefiabjdhggihccec";
        System.out.println(canConstruct(a,b));
    }
    // 我的 56 ms；
    // Your runtime beats 33.29% of java submissions.
    public static boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote == null|| ransomNote.equals("")) return true;
        if (magazine == null)return false;
        char [] ransomNoteData = ransomNote.toCharArray();
        char [] magazineData =magazine.toCharArray();
        List<Character> data = new LinkedList<>();
        for (char c:magazineData)
        {
            data.add(c);
        }
        for(char c:ransomNoteData)
        {
            if (data.contains(c)){
                for (int i = 0; i <data.size() ; i++) {
                    if (data.get(i)==c){
                        data.remove(i);
                        break;
                    }
                }
            }else {
                return false;
            }
        }
        return true;
    }
    // 大神做法
    public static boolean canConstruct1(String ransomNote, String magazine) {
        int[] arr = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            arr[magazine.charAt(i) - 'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            if(--arr[ransomNote.charAt(i)-'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}

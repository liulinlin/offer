package com.liu.leetcode;

/**
 * Created by liulinlin1 on 2016/8/12.
 */
public class RansomNote {
    public static void main(String[] args) {
        String a = "bjaajgea";
        String b = "affhiiicabhbdchbidghccijjbfjfhjeddgggbajhidhjchiedhdibgeaecffbbbefiabjdhggihccec";
        System.out.println(canConstruct(a,b));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote == null   || magazine == null ) return  false;
        if (ransomNote.length() ==0 && magazine.length() == 0) return  true;
        if (ransomNote.length() ==0 && magazine.length() != 0) return  true;
        if (ransomNote.length() !=0 && magazine.length() == 0) return  false;
        char ransom [] = ransomNote.toCharArray();
        char maga [] = magazine.toCharArray();
        int ransomLength = ransom.length;
        int magaLangth = maga.length;
        if (ransomLength >magaLangth) return  false;
        for (int i = 0; i <= magaLangth - ransomLength; i++) {
            if (ransom[0] == maga[i]){
                int j = 1;
                int g = 1+i;
                while (j<ransomLength && g<magaLangth){
                    if (ransom[j] == maga[g]){
                        j++;
                    }
                    g++;
                }
                if (j==ransomLength) return  true;
            }
        }
        return  false;
    }
}

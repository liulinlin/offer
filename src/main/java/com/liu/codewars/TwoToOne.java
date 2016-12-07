package com.liu.codewars;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by liulinlin on 2016/12/7.
 */
public class TwoToOne {
    public static String longest(String s1, String s2) {
        Set<Character> result = new TreeSet<>();
        char[] s11 = s1.toCharArray();
        for (char e : s11) {
            result.add(new Character(e));
        }
        char[] s22 = s2.toCharArray();
        for (char e : s22) {
            result.add(new Character(e));
        }
        Iterator<Character> iterator = result.iterator();
        StringBuilder sb = new StringBuilder();
        while (iterator.hasNext()) {
            sb.append(iterator.next());
        }
        return sb.toString();
    }
}

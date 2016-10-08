package com.liu.practice.enumeration;

/**
 * @author liulinlin1
 * @since：2016/9/27
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(EnumTest.CSA.toString());
        System.out.println(EnumTest.getByString("CSA").getClass().getName());
    }
}

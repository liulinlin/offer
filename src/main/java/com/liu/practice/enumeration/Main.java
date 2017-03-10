package com.liu.practice.enumeration;

/**
 * @author liulinlin1
 * @since：2016/9/27
 *
 * 比较EnumTest1 和EnumTest2 可以 把 Enum 外面的当初抽象类来对待，里面的每个枚举就是外面抽象类的实现。
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(EnumTest.CSA.toString());
        System.out.println(EnumTest.getByString("CSA").getClass().getName());
        EnumTest1 enumTest1 = EnumTest1.CSA;
        enumTest1.setId(1);
        System.out.println(enumTest1.getId());
        EnumTest2 enumTest2 = EnumTest2.CSA;
        enumTest2.getID();

    }
}

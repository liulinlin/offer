package com.liu.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by 刘林林 on 2016/3/2.
 */
public class Practice {
    public static void main(String[] args) {
//        int[] tt = {1, 2, 10, 4, 5, 6, 1, 2, 10, 4, 5};
//        Practice.getSingleNumber(tt);
//        testValue();
//        testValueInterger();
//        testValueObject();
//        testValueArray();
//        IntTest();
    }

    public static void getSingleNumber(int[] array) {
        int x = 0;
        for (int i = 0; i < array.length; i++) {
            x ^= array[i];
        }
        System.out.print(x);
    }

    public static void IterrableTest() {
        ArrayList<Integer> test = new ArrayList<>();
        test.add(1);
        test.add(2);
        test.add(3);
        test.add(4);

        Iterator iterator = test.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    public static void IterrableTest2() {
        HashSet<Integer> test = new HashSet<>();
        test.add(1);
        test.add(2);
        test.add(3);
        test.add(4);

        Iterator iterator = test.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    // 以下四个方法说明：对于基本类型 是 值传递。对于 对象 ，是引用传递。数组 集合 传递的是引用。
    public static  void testValue(){
        int x = 10;
        testValue2(x);
        System.out.println("testValue中x的值 : "+x);
    }
    public static  void testValue2(int x){
        x = 20;
        System.out.println("testValue2中x的值 : "+x);
    }
    public static  void testValueArray(){
        int [] x = {10,20,30};
        testValueArray2(x);
        System.out.println("testValue中x的值 : "+x[0]);
    }
    public static  void testValueArray2(int [] x){
        x[0] = 40;
        x[1] = 50;
        x[2] = 60;
        System.out.println("testValue2中x的值 : "+x[0]);
    }
    public static  void testValueInterger(){
        Integer x = new Integer(10);
        testValueInterger2(x);
        System.out.println("testValue中x的值 : "+x);
    }
    public static  void testValueInterger2(Integer x){
        x =  new Integer(20);
        System.out.println("testValue2中x的值 : "+x);
    }

    public static  void testValueObject(){
        Person p = new Person("张三","1111",10);
        testValueObject2(p);
        System.out.println("testValueObject中person的值 : "+p);
    }
    public static  void testValueObject2( Person p){
        p.setAge(20);
        p.setName("李四");
        p.setPassword("2222");
        System.out.println("testValueObject2中x的值 : "+p);
    }
// 测试 int 跟 Integer  == 是否相等
    public static void IntTest(){
        int num1 = 1;
        Integer num1_ = new Integer(1);
        int num2 = 255;
        Integer num2_ = new Integer(255);
        System.out.println(num1 == num1_); // int  跟 Integer 做 == ,会自动拆箱
        System.out.println(num2 == num2_);
    }
}

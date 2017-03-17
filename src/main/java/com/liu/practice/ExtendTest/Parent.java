package com.liu.practice.ExtendTest;

/**
 * Created by liulinlin on 2017/3/17.
 */
public class Parent {
    static {
        System.out.println("Parent static");
    }
    {
        System.out.println("Parent 成员对象");
    }
    public Parent(){
        System.out.println("Parent Contrucure");
    }
}

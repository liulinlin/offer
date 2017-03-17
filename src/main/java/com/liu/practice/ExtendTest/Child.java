package com.liu.practice.ExtendTest;

/**
 * Created by liulinlin on 2017/3/17.
 */
public class Child extends Parent {
    static {
        System.out.println("Child static");
    }
    {
        System.out.println("Child 成员对象");
    }
    public Child(){
        System.out.println("Child Contrucure");
    }
}

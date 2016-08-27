package com.liu.practice.extendsTest;

/**
 * User: linlinliu
 * Date: 16-7-9
 * Time: 下午11:18
 * Email: 553656977@qq.com
 */
public class Main {
    public static void main(String[] args) {
        Child c1 = new Child();
        System.out.println(c1.getTest());
//        Child c2 = new Child(100); // 编译出错　说明含参数的需要重写
    }
}

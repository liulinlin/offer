package com.liu.pattern.singleton;

/**
 * Created by 刘林林 on 2016/3/12.
 */
public class Client {


    public static void main(String[] args) {
        Singleton02 s2 = Singleton02.getInstance();
        Singleton01 s1 = Singleton01.getInstance();
    }
}

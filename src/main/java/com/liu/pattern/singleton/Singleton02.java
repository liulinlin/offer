package com.liu.pattern.singleton;

/**
 * Created by 刘林林 on 2016/3/12.
 * 饿汉模式模拟
 */
public class Singleton02 {
    private static Singleton02 instance = new Singleton02();

    private Singleton02() {
    }

    public static Singleton02 getInstance() {
        return instance;
    }
}

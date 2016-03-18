package com.liu.pattern.singleton;

/**
 * Created by 刘林林 on 2016/3/12.
 * 懒汉模式模拟
 */
public class Singleton01 {

    // 避免了类在外部被实例化
    private Singleton01() {
    }

    private static Singleton01 single = null;

    //静态工厂方法
    public static synchronized Singleton01 getInstance() {
        if (single == null) {
            single = new Singleton01();
        }
        return single;
    }
}

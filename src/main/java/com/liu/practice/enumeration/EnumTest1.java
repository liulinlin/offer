package com.liu.practice.enumeration;

/**
 * Created by liulinlin on 2017/3/10.
 * 这是一种使用的方式，将id 设置在 外面,
 * 使用时，得到该枚举，可以自己再SetID ,也可以getID
 */
public enum EnumTest1 {
    CSA(1);
    private int id;

    EnumTest1(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

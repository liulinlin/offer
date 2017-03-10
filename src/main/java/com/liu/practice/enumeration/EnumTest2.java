package com.liu.practice.enumeration;

/**
 * Created by liulinlin on 2017/3/10.
 * 这个是另一种实现方式，这个id就是写在每一个枚举值里面了，
 *
 */
public enum EnumTest2 {
    CSA {
        int id = 1;
        @Override
        public int getID() {
            return 0;
        }

        @Override
        public void setID(int id) {
            this.id = id;
        }
    };
    public abstract int getID();
    public abstract void setID(int id);
}

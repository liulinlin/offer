package com.liu.pattern.template;

/**
 * Created by 刘林林 on 2016/3/12.
 */
public class Client {
    public static int[] a = {1, 6, 3, 43, 2, 8, 0};
    public static void main(String[] args) {
//        AbstractTemplate aa = new ConcreteTemplate();
        AbstractTemplate aa = new ConcreteTemplate2();
        aa.ShowArray(a);
    }
}

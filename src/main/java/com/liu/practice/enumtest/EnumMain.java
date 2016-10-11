package com.liu.practice.enumtest;

import java.util.Date;

/**
 * Created by liulinlin on 2016/10/2.
 */
public class EnumMain {
    public static void main(String[] args) {
        EnumBean bean = new EnumBean();
        bean.setId(1);
        bean.setName("abc");
        bean.setTime(new Date());

        EnumOpertion.Operation(bean);
    }
}

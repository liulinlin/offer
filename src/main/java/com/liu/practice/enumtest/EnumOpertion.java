package com.liu.practice.enumtest;

import com.google.gson.Gson;
import com.liu.practice.enumtest.type.MYNOTNULL;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * Created by liulinlin on 2016/10/2.
 */
public class EnumOpertion {

    public static void Operation(EnumBeanParent bean){
        Gson gson = new Gson();

        Class c = bean.getClass();
        Field[] fields = c.getFields();
        for (Field f :fields){
            System.out.println(f);
            Annotation[] annotations = f.getAnnotations();
            for (Annotation a :annotations){
                System.out.println(a);
            }
        }

        System.out.println(gson.toJson(bean));
    }
}

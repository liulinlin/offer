package com.liu.practice.base.reflect;

import java.io.ObjectInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by 刘林林 on 2016/3/18.
 */
public class ClassUtil {

    /*
    打印所有 方法 信息
     */
    public static void PrintMethodInfo(Object obj) {
        Class c = obj.getClass();
        System.out.println("类的名字是：" + c.getName());
        /*
        下一步 要得到 所有的方法
        getMethods（） 可以得到 所有的 public 方法 包括父类的
        getDeclaredMethods() 得到 自己声明的 方法 ，不限public ,private protect 都可以拿到
         */
        Method[] methods = c.getMethods();
        for (Method m : methods) {
            /*
            m.getReturnType() 返回的是 方法返回类型的 类类型；所以得到 返回类型的名字 需要 用getName()
             */
            System.out.print(m.getReturnType().getSimpleName() + " ");
            System.out.print(m.getName() + "(");
            /*
             m.getParameterTypes() 得到所有 参数的 类型的类类型，
             */
            Class[] methodParamClass = m.getParameterTypes();
            for (Class mc : methodParamClass) {
                System.out.print(mc.getSimpleName() + ",");
            }
            System.out.println(")");
        }
    }

    /*
    打印所有成员变量的信息
    java.lang.reflect.Field
    Field 类封装了关于成员变量的操作
    getFields()
    getDeclaredFields()
     */
    public static void PrintFieldInfo(Object obj) {
        Class c = obj.getClass();
        Field[] fs = c.getDeclaredFields();
        for (Field f : fs) {
            Class typeNameClass = f.getType();
            String typeName = typeNameClass.getSimpleName();

            String fieldName = f.getName();
            System.out.println(typeName + " " + fieldName);
        }
    }

    /**
     * 打印对象的构造函数的信息
     *
     * @param obj
     */
    public static void PrintConMessage(Object obj) {
        Class c = obj.getClass();
        /*
         * 构造函数也是对象
		 * java.lang. Constructor中封装了构造函数的信息
		 * getConstructors获取所有的public的构造函数
		 * getDeclaredConstructors得到所有的构造函数
		 */
        //Constructor[] cs = c.getConstructors();
        Constructor[] cs = c.getDeclaredConstructors();
        for (Constructor constructor : cs) {
            System.out.print(constructor.getName() + "(");
            //获取构造函数的参数列表--->得到的是参数列表的类类型
            Class[] paramTypes = constructor.getParameterTypes();
            for (Class class1 : paramTypes) {
                System.out.print(class1.getSimpleName() + ",");
            }
            System.out.println(")");
        }
    }

}

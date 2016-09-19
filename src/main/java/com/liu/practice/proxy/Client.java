package com.liu.practice.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author: liulinlin1@jiuxian.com
 * @since：2016年8月2日 上午9:59:51
 */
public class Client {

    public static void main(String[] args) {
        Subject subject = getProxy();
        System.out.println(subject.getClass().getName());
        System.out.println();
        subject.rent();
        System.out.println();
        subject.sayhello();
    }
/*
更多时候 这些东西放在一起。
 */
    public static Subject getProxy() {
        Subject realsubject = new RealSubject();
        InvocationHandler handler = new DynamicProxy(realsubject);
        return (Subject) Proxy.newProxyInstance(handler.getClass().getClassLoader(), realsubject.getClass().getInterfaces(), handler);
    }

}

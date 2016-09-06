package com.liu.practice.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author: liulinlin1@jiuxian.com
 * @since：2016年8月2日 上午9:57:09
 */
public class DynamicProxy implements InvocationHandler {

	private Subject subject;

	public DynamicProxy(Subject subject) {
		this.subject = subject;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("before rent house");

		System.out.println("Method:" + method);

		// 当代理对象调用真实对象的方法时，其会自动的跳转到代理对象关联的handler对象的invoke方法来进行调用
		method.invoke(subject, args);

		// 在代理真实对象后我们也可以添加一些自己的操作
		System.out.println("after rent house");

		return null;
	}

	

}

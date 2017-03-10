package com.liu.pattern.singleton;

/**
 * 懒汉法，线程安全
 * 
 * @author: liulinlin1@jiuxian.com
 * @since：2016年7月27日 上午9:22:38
 */
public class Singleton1 {
	//定义一个静态私有变量(不初始化，不使用final关键字，
	// 使用volatile保证了多线程访问时instance变量的可见性，
	// 避免了instance初始化时其他变量属性还没赋值完时，被另外线程调用)
	private static volatile  Singleton1 instance = null;

	private Singleton1() {
	}

	public static Singleton1 getInstance() {
		if (instance == null) {
			synchronized (Singleton1.class) {
				if (instance == null) {
					instance = new Singleton1();
				}
			}
		}
		return instance;
	}
}
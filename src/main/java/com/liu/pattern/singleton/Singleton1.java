package com.liu.pattern.singleton;

/**
 * 懒汉法，线程安全
 * 
 * @author: liulinlin1@jiuxian.com
 * @since：2016年7月27日 上午9:22:38
 */
public class Singleton1 {
	private volatile static Singleton1 instance = null;

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
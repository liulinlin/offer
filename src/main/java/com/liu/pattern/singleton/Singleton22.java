package com.liu.pattern.singleton;

/**
 * 饿汉法，线程安全
 * 
 * @author: liulinlin1@jiuxian.com
 * @since：2016年7月27日 上午9:25:59
 */
public class Singleton22 {
	private static Singleton22 instance = null;

	private Singleton22() {
	}

	static {
		instance = new Singleton22();
	}

	public Singleton22 getInstance() {
		return instance;
	}
}

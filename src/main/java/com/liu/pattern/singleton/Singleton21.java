package com.liu.pattern.singleton;

/**
 * 饿汉法，线程安全
 * 
 * @author: liulinlin1@jiuxian.com
 * @since：2016年7月27日 上午9:24:29
 */
public class Singleton21 {
	private static Singleton21 instance = new Singleton21();

	private Singleton21() {
	}

	public static Singleton21 getInstance() {
		return instance;
	}
}

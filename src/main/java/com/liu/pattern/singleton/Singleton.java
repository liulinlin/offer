package com.liu.pattern.singleton;

/**
 * 静态内部类，线程安全
 * 
 * 静态内部类是在使用中初始化的，所以可以利用这个天生的延迟加载特性，去实现一个简单，延迟加载，线程安全的单例模式
 * 
 * @author: liulinlin1@jiuxian.com
 * @since：2016年7月27日 上午9:28:54
 */
public class Singleton {
	private String name = "";

	private static class SingletonHolder {
		private static final Singleton instance = new Singleton();
	}

	private Singleton() {
		name = "static inner class thread-safety";
	}

	public static Singleton getInstance() {
		return SingletonHolder.instance;
	}
}

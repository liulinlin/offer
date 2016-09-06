package com.liu.pattern.singleton;

/**
 * 枚举写法 单例
 * 
 * @author: liulinlin1@jiuxian.com
 * @since：2016年7月27日 上午9:28:05
 */
public enum SingleEnum {
	INSTANCE("enum singleton thread-safety");

	private String name;

	SingleEnum(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}

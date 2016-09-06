package com.liu.practice.proxy;
/** 
* @author: liulinlin1@jiuxian.com	
* @since：2016年8月2日 上午9:55:16 
*/
public class RealSubject implements Subject {

	@Override
	public void rent() {
		System.out.println("this is rent() method");
	}

	@Override
	public void sayhello() {
		System.out.println("this is sayhello() method");
	}

}

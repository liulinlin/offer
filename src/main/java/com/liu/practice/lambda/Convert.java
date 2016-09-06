package com.liu.practice.lambda;
/** 
* @author: liulinlin1@jiuxian.com	
* @since：2016年8月16日 上午10:49:54 
*/
public interface Convert<F, T> {

	T convert(F f);
}

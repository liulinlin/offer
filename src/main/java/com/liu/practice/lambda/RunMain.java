package com.liu.practice.lambda;

/**
 * @author: liulinlin1@jiuxian.com
 * @since：2016年8月16日 上午10:50:56
 */
public class RunMain {

	public static void main(String[] args) {
		// 第一种方式
		Convert<String, Integer> converter = (from) -> Integer.valueOf(from);
		Integer converted = converter.convert("123");
		System.out.println(converted); // 123
		// 第二种方式
		testLambda((from) -> Integer.valueOf(from), "123");
	}

	public static void testLambda(Convert<String, Integer> action, String f) {
		System.out.println(action.convert(f));
	}

}

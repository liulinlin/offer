package com.liu.practice.littleCase;

import java.util.concurrent.ForkJoinPool;

/**
 * @author: liulinlin1@jiuxian.com
 * @since：2016年7月8日 下午2:55:33
 */
public class ForkJoinMain {
	public final static ForkJoinPool mainPool = new ForkJoinPool();

	public static void main(String[] args) {
		MyTask task = new MyTask(1L,200000L);  
        long count = mainPool.invoke(task);  
        System.out.println("ForkJoin计算结果："+count);
        System.out.println("主程序计算结果："+getSum(1L,200000L));
	}
	
	private static long getSum(long start,long end) {
		long sum = 0;
		for(long i = start;i<=end;i++){
			sum +=i;
		}
		return sum;
	}
}

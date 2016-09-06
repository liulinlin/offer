package com.liu.practice.littleCase;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author: liulinlin1@jiuxian.com
 * @since：2016年7月18日 上午10:31:12
 */
public class MyTask2 {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		ComputeNSumTask task = new ComputeNSumTask(100);
		Future<Integer> result = executorService.submit(task);
		executorService.shutdown();
		while (true) {
			if (result.isDone()) {
				try {
					System.out.println(result.get());
					break;
				} catch (InterruptedException | ExecutionException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}

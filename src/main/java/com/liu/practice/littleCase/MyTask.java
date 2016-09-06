package com.liu.practice.littleCase;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.RecursiveTask;

/** 
* @author: liulinlin1@jiuxian.com	
* @since：2016年7月8日 下午2:56:28 
*/
public class MyTask extends RecursiveTask<Long> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long start;
	private long end;
	public MyTask(long start,long end){
		super();
		this.start = start;
		this.end = end;
	}

	@Override
	protected Long compute() {
		long result  =0;
		if(end-start >10000){
			MyTask task1 = new MyTask(start, start+100);
			MyTask task2 = new MyTask(start+101, end);
			invokeAll(task1, task2);  
			try {
				result =  task1.get()+task2.get();
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (ExecutionException e) {
				e.printStackTrace();
			}
		}else{
			result =  getSum(start, end);
		}
		return result;
	}

	private long getSum(long start,long end) {
		long sum = 0;
		for(long i = start;i<=end;i++){
			sum +=i;
		}
		return sum;
	}
}

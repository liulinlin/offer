package com.liu.practice.littleCase;

import java.util.concurrent.Callable;

/** 
* @author: liulinlin1@jiuxian.com	
* @since：2016年7月18日 上午10:24:19 
*/
public class ComputeNSumTask implements Callable<Integer>{
	private int n = 0;
	
	public ComputeNSumTask(int n){
		this.n = n;
	}
	@Override
	public Integer call() throws Exception {
		return getSum();
	}

	private int getSum() {
		int sum = 0;
		for(int i = 1;i<n;i++){
			sum +=i;
		}
		return sum;
	}
}

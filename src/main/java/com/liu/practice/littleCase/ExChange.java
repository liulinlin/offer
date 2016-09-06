package com.liu.practice.littleCase;
/** 
* @author: liulinlin1@jiuxian.com	
* @since：2016年8月11日 上午11:47:47 
*/
public class ExChange {

	public static void main(String[] args) {
		int A = 10 ;
		int B = 20;
		A = A^B;
		B = A^B;
		A = A^B;
		
		System.out.println(A);
		System.out.println(B);
	}

}

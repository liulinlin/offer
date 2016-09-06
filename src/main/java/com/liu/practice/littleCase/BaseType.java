package com.liu.practice.littleCase;

/**
 * @author: liulinlin1@jiuxian.com
 * @since：2016年6月30日 上午11:26:51
 */
public class BaseType {
	int testint ;
	short testshort;
	byte testbyte ;
	boolean testboolean;
	long testlong;
	float testfloat;
	double testdouble;
	char testchar;
	public static void main(String[] a) {
		System.out.println(new BaseType().testint);
		System.out.println(new BaseType().testboolean);
	}
	public BaseType(){
//		System.out.println(this.testint);
//		System.out.println(this.testbyte);
//		System.out.println(this.testboolean);
//		System.out.println(this.testlong);
//		System.out.println(this.testshort);
//		System.out.println(this.testfloat);
//		System.out.println(this.testdouble);
//		System.out.println("a"+this.testchar+"a");
	}
}

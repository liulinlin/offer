package com.liu.practice.threadlocalCase;

import java.util.Random;

/** 
* @author: liulinlin1@jiuxian.com	
* @since：2016年8月24日 下午4:56:18 
*/
public class ThradLocalCase {
	/**
	 * ThreadLocal 内部get方法 的实现，可以看到 在拿出之前，先去 一个map中去看有没有，若没有 则调用setInitialValue
	 *  public T get() {
        Thread t = Thread.currentThread();
        ThreadLocalMap map = getMap(t);
        if (map != null) {
            ThreadLocalMap.Entry e = map.getEntry(this);
            if (e != null) {
                @SuppressWarnings("unchecked")
                T result = (T)e.value;
                return result;
            }
        }
        return setInitialValue();
    }
    private T setInitialValue() {
        T value = initialValue();
        Thread t = Thread.currentThread();
        ThreadLocalMap map = getMap(t);
        if (map != null)
            map.set(this, value);
        else
            createMap(t, value);
        return value;
    }
	 */
	final public static  ThreadLocal<Random> localRandom = new ThreadLocal<Random>(){
		@Override
		protected Random initialValue() {
			return new Random();
		}
	};

	public static void main(String[] args) {
		// LLL Auto-generated method stub

	}

}

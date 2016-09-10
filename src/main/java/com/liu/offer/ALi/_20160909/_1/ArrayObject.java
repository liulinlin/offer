package com.liu.offer.ALi._20160909._1;

/**
 * Created by Administrator on 2016/9/9.
 */
public class ArrayObject {
    private Object [] data;
    private int used;
    private int length;

    public ArrayObject(int size){
        used = 0;
        length = size;
        data = new Object[size];
    }
    public ArrayObject(){
        used = 0;
        length = 16;
        data = new Object[16];
    }
    public void add(Object o){
        if(used+1==length){
            kuorong();
        }
        data[used++] = 0;
    }
    public void kuorong(){

    }
}

package com.liu.Guava;

import com.google.common.collect.ImmutableList;

import java.util.List;

/**
 * Created by 刘林林 on 2016/3/5.
 */
public class Immutable {
    // 不可变集合的目的： 保证内部引用（这里的people）不会传播到外面
    //guava 做法
    private ImmutableList test;
    public void testImmutable(ImmutableList input){
        this.test = input;
    }
    public List<Immutable> getTest(){
        return test;
    }

    // 传统做法
    private List test2;
    public void  testImmutable(List input){
        this.test2.addAll(input);
    }
//    public List getTest2(){
//        return (List)this.test2.clone();
//    }
}

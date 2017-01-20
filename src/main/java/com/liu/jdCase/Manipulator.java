package com.liu.jdCase;

import com.liu.practice.Person;

/**
 * @author: liulinlin@jd.com
 * @since: 2017/1/20
 *
 * 这个地方验证 泛型的擦除，当 仅仅标示 T的时候 get 方法里面是不能使用o的getAge(）方法的 ，但是
 * 当 T extends Person 时 就可以了，
 */
public class Manipulator<T extends Person> {
    private T o;
    public Manipulator(T x){
        this.o = x;
    }
    public void get(){
        o.getAge();
    }
}

package com.liu.practice.base.serializable;

import java.io.Serializable;

/**
 * Created by 刘林林 on 2016/3/18.
 */
public class Person implements Serializable{
    private String name;
    private String password;
    private int age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                '}';
    }

    public Person() {
    }

    public Person(String name, String password, int age) {
        this.name = name;
        this.password = password;
        this.age = age;
    }
}

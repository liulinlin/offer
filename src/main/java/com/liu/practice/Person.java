package com.liu.practice;

/**
 * Created by 刘林林 on 2016/3/23.
 */
public class Person {
    private String name ,password ;
    private int age;
    public Person(String name, String password, int age) {
        this.name = name;
        this.password = password;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPassword(String password) {

        this.password = password;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getAge() {

        return age;
    }

    public String getPassword() {

        return password;
    }

    public String getName() {

        return name;
    }
}

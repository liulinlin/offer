package com.liu.practice.concurrent.semaphore;

import java.util.concurrent.Exchanger;

/**
 * Created by 刘林林 on 2016/3/24.
 */
public class EDemo {
    public static void main(String[] args) {
        Exchanger ex = new Exchanger();
        new A(ex,"A").start();
        new B(ex,"B").start();
    }
}
class A extends Thread{
    private Exchanger<String> ex;
    public  A(Exchanger e,String name)
    {
        this.ex = e;
        setName(name);
    }
    public void run(){
        String str = null;
        try {
            str = ex.exchange(getName()+"发来1");
            System.out.println(getName()+"中打印次消息："+str);

            str = ex.exchange(getName()+"发来2");
            System.out.println(getName()+"中打印次消息："+str);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class B extends Thread{
    private Exchanger<String> ex;
    public  B(Exchanger e,String name)
    {
        this.ex = e;
        setName(name);
    }
    public void run(){
        String str = null;
        try {
            str = ex.exchange(getName()+"发来3");
            System.out.println(getName()+"中打印的消息："+str);

            str = ex.exchange(getName()+"发来4");
            System.out.println(getName()+"中打印的消息："+str);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
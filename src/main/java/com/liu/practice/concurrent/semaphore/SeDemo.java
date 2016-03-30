package com.liu.practice.concurrent.semaphore;

import java.util.concurrent.Semaphore;

/**
 * Created by 刘林林 on 2016/3/24.
 */
public class SeDemo  {
    public static void main(String [] args)
    {
        Semaphore s = new Semaphore(2);
        PersonThread  p1 = new PersonThread(s,"A");
        p1.start();
        PersonThread  p2 = new PersonThread(s,"B");
        p2.start();
        PersonThread  p3 = new PersonThread(s,"C");
        p3.start();
        PersonThread  p4 = new PersonThread(s,"D");
        p4.start();
    }
}

class PersonThread extends  Thread{
    private Semaphore semaphore;
    public PersonThread(Semaphore s,String Name){
        setName(Name);
        this.semaphore = s;
    }
    public void  run(){
        System.out.println(getName()+"等待中...");
        try {
            semaphore.acquire();
            System.out.println(getName()+"服务中...");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(getName()+"完成了...");
        semaphore.release();
    }
}

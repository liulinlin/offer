package com.liu.practice.concurrent.semaphore;

import java.util.concurrent.CountDownLatch;

/**
 * Created by 刘林林 on 2016/3/24.
 */
public class CDDemo {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch c = new CountDownLatch(3);
        new Racer(c,"A").start();
        new Racer(c,"B").start();
        new Racer(c,"C").start();
        for (int i = 0; i < 3; i++) {
            System.out.println(3-i);
            c.countDown();
            Thread.sleep(1000);
        }
        System.out.println("start");
    }
}

class Racer extends Thread{
    private CountDownLatch countDownLatch;

    public Racer(CountDownLatch c ,String Name ){
        countDownLatch = c;
        setName(Name);
    }

    public void  run(){
        try {
            countDownLatch.await();
            for (int i = 0; i < 3; i++) {
                System.out.println(getName()+":"+i);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

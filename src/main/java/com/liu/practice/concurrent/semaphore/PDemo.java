package com.liu.practice.concurrent.semaphore;

import java.util.concurrent.Phaser;

/**
 * Created by 刘林林 on 2016/3/24.
 */
public class PDemo {
    public static void main(String[] args) {
        Phaser phaser = new Phaser(2);
        new Worker(phaser,"大厨师").start();
        new Worker(phaser,"传菜员").start();
        new Worker(phaser,"服务员").start();

        for (int i = 1; i <= 3; i++) {
            phaser.arriveAndAwaitAdvance();
            System.out.println("处理完一个菜");
        }
        phaser.arriveAndDeregister();
        System.out.println("菜上完了 ，动手吃吧");
    }
}
class Worker extends Thread{
    private Phaser p;
    public Worker(Phaser pp,String Name){
        setName(Name);
        this.p = pp;
        pp.register();
    }
    public  void run(){
        for (int i = 1; i <= 3; i++) {
            System.out.println(getName()+"在准备第"+i+"道菜");
            if (i == 3) {
                p.arriveAndDeregister();
            }else {
                p.arriveAndAwaitAdvance();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

package com.liu.practice.concurrent.semaphore;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * Created by 刘林林 on 2016/3/24.
 */
public class CDemo {
    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(3, new Runnable() {
            @Override
            public void run() {
                System.out.println("Game Start");
            }
        });

        new Player(cyclicBarrier,"A").start();
        new Player(cyclicBarrier,"B").start();
        new Player(cyclicBarrier,"C").start();
    }
}
class Player extends Thread{
    private CyclicBarrier cyclicBarrier;
    public  Player(CyclicBarrier c,String name){
        this.cyclicBarrier = c;
        setName(name);
    }
    public void run(){
        try {
            System.out.println("正在等待其他玩家"+getName());
            cyclicBarrier.await();
            System.out.println("走起。。。。"+getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}

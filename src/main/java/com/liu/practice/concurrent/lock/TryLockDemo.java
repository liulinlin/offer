package com.liu.practice.concurrent.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @功能：tryLock使用
 * @版本：1.0
 */
public class TryLockDemo {

    // 锁
    private final Lock lock = new ReentrantLock();

    public void take() {
        if (lock.tryLock()) {
            try {
                System.out.println("take获取到锁...");
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        } else {
            System.out.println("take没有获取到锁...");
        }
    }

    public void put() {
        if (lock.tryLock()) {
            try {
                System.out.println("put获取到锁...");
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        } else {
            System.out.println("put没有获取到锁...");
        }
    }

    public static void main(String[] args) {

        TryLockDemo t = new TryLockDemo();
        Take take = new Take(t);
        Put put = new Put(t);
        Thread t1 = new Thread(take);
        Thread t2 = new Thread(put);

        t1.start();
        t2.start();
    }
}

class Take implements Runnable {

    private TryLockDemo t;

    public Take(TryLockDemo t) {
        this.t = t;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            t.take();
        }
    }
}

class Put implements Runnable {

    private TryLockDemo t;

    public Put(TryLockDemo t) {
        this.t = t;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            t.put();
        }
    }
}

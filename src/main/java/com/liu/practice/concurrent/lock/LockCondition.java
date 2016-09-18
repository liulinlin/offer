package com.liu.practice.concurrent.lock;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author liulinlin1 on 2016/9/18.
 */
public class LockCondition {
    public static Lock lock = new ReentrantLock();
    ;
    // 容器已满  綁定product線程
    public static Condition full = lock.newCondition();
    // 容器为空  綁定consumer線程
    public static Condition empty = lock.newCondition();

    public static void main(String[] args) {
        List list = new ArrayList(12);
        Product product = new Product(list, 10);
        Consumer consumer = new Consumer(list, 0);

        Thread t1 = new Thread(product);
        Thread t2 = new Thread(consumer);

        t1.start();
        t2.start();
    }

    // 生产
    static class Product implements Runnable {

        private List list;
        private int maxCount;

        public Product(List list, int maxCount) {
            super();
            this.list = list;
            this.maxCount = maxCount;
        }

        @Override
        public void run() {
            while (true) {
                if (lock.tryLock()) {
                    try {
                        if (getSize() >= maxCount) {
                            System.out.println("容器已滿，product線程加入池中...");
                            full.await();
                        }
                        System.out.println("開始生產....");
                        list.add(new Object());
                        //喚醒消費者線程
                        empty.signal();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        lock.unlock();
                    }
                } else {
                    System.out.println("未获取生产资格...");
                }
            }
        }

        public int getSize() {
            return list.size();
        }
    }

    // 消费
    static class Consumer implements Runnable {

        private List list;
        private int minCount;

        public Consumer(List list, int minCount) {
            super();
            this.list = list;
            this.minCount = minCount;
        }

        @Override
        public void run() {
            while (true) {
                if (lock.tryLock()) {
                    try {
                        if (getSize() <= minCount) {
                            System.out.println("容器已空，consumer線程加入池中...");
                            empty.await();
                        }
                        System.out.println("開始消費....");
                        list.remove(0);
                        //喚醒生產者線程
                        full.signal();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        lock.unlock();
                    }
                } else {
                    System.out.println("未获取消费资格...");
                }
            }
        }

        public int getSize() {
            return list.size();
        }
    }
}

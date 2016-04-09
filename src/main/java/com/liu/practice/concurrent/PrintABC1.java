package com.liu.practice.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 用线程池、Lock锁和condition(Object 监视器方法的使用)组合使用实现：
*/

public class PrintABC1 {
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    private int count;

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        PrintABC1 abc = new PrintABC1();
        for (int i = 0; i < 10; i++) {
            executorService.execute(abc.new Run("AAAAAAAAAAAAAAAA", 1));
            executorService.execute(abc.new Run("BBBBBBBBBBBBBBBBB", 2));
            executorService.execute(abc.new Run("CCCCCCCCCCCCCCCC", 3));
        }
        executorService.shutdown();
    }

    class Run implements Runnable {
        private String _name = "";
        private int _threadNum;

        public Run(String name, int threadNum) {
            _name = name;
            _threadNum = threadNum;
        }

        @Override
        public void run() {
            lock.lock();
            try {
                while (true) {
                    if (count % 3 == _threadNum - 1) {
                        System.out.println("Thread-Name:" + _name);
                        count++;
                        condition.signalAll();
                        break;
                    } else {
                        try {
                            condition.await();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            } finally {
                lock.unlock();
            }
        }
    }
}

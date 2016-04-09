package com.liu.practice.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 用线程池、synchronized关键字和Object 监视器方法组合实现（实现跟第一种大同小异）：
 */
public class PrintABC2 {
    private Object lock = new Object();
    private int count;

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        PrintABC2 abc = new PrintABC2();
        for (int i = 0; i < 10; i++) {
            executorService.execute(abc.new Run("AAAAAAAAAAAAAAAA", 1));
            executorService.execute(abc.new Run("BBBBBBBBBBBBBBBBB", 2));
            executorService.execute(abc.new Run("CCCCCCCCCCCCCCcCC", 3));
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
            synchronized (lock) {
                while (true) {
                    if (count % 3 == _threadNum - 1) {
                        System.out.println("Thread-Name:" + _name);
                        count++;
                        lock.notifyAll();
                        break;
                    } else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}

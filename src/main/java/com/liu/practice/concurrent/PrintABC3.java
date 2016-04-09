package com.liu.practice.concurrent;

/**
 * 不用线程池，synchronized关键字和Object 监视器方法组合实现（Lock和Condition差不多就不写了）：
 */
public class PrintABC3 {
    private Object lock = new Object();
    private int count;

    public static void main(String[] args) {
        PrintABC3 abc = new PrintABC3();
        new Thread(abc.new Run("AAAAAAAAAAAAAAAA", 1)).start();
        new Thread(abc.new Run("BBBBBBBBBBBBBBBBB", 2)).start();
        new Thread(abc.new Run("CCCCCCCCCCCCCCcCC", 3)).start();
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
            for (int i = 0; i < 10; i++) {
                synchronized (lock) {
                    while (true) {
                        if (count % 3 == _threadNum - 1) {
                            System.out.println("Count:" + i + ",Thread-Name:"
                                    + _name);
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
}

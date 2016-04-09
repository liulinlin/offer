package com.liu.practice.concurrent;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by 刘林林 on 2016/3/25.
 */
public class PrintABC4 {
    public static final ReentrantLock LOCK = new ReentrantLock();
    private static final Condition COND_A = LOCK.newCondition();
    private static final Condition COND_B = LOCK.newCondition();
    private static final Condition COND_C = LOCK.newCondition();
    private static volatile boolean canPrintA = true;
    private static volatile boolean canPrintB = false;
    private static volatile boolean canPrintC = false;

    public static void main(String[] args) {
        new Thread(new PrintATask()).start();
        new Thread(new PrintBTask()).start();
        new Thread(new PrintCTask()).start();
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static class PrintATask implements Runnable{
        @Override
        public void run() {
            while(true){
                try {
                    LOCK.lock();
                    while(!canPrintA){
                        COND_A.await();
                    }
                    TimeUnit.SECONDS.sleep(1);
                    System.out.print('a');
                    canPrintA = false;
                    canPrintB = true;
                    canPrintC = false;
                    COND_B.signalAll();
                } catch (InterruptedException e) {
                } finally{
                    LOCK.unlock();
                }
            }
        }
    }

    public static class PrintBTask implements Runnable{
        @Override
        public void run() {
            while(true){
                try {
                    LOCK.lock();
                    while(!canPrintB){
                        COND_B.await();
                    }
                    TimeUnit.SECONDS.sleep(1);
                    System.out.print('b');
                    canPrintA = false;
                    canPrintB = false;
                    canPrintC = true;
                    COND_C.signalAll();
                } catch (InterruptedException e) {
                } finally{
                    LOCK.unlock();
                }
            }
        }
    }

    public static class PrintCTask implements Runnable{
        @Override
        public void run() {
            while(true){
                try {
                    LOCK.lock();
                    while(!canPrintC){
                        COND_C.await();
                    }
                    TimeUnit.SECONDS.sleep(1);
                    System.out.print('c');
                    canPrintA = true;
                    canPrintB = false;
                    canPrintC = false;
                    COND_A.signalAll();
                } catch (InterruptedException e) {
                } finally{
                    LOCK.unlock();
                }
            }
        }
    }
}

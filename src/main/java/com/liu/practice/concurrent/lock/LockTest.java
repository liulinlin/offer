package com.liu.practice.concurrent.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Lock 相对于 Synchronized 来说，
 * 1 可以不让等待的线程一直无期限地等待下去（比如只等待一定的时间或者能够响应中断）
 * 2 对于读写可以分开来控制，读操作和写操作会发生冲突现象，写操作和写操作会发生冲突现象，但是读操作和读操作不会发生冲突现象
 * 3 通过Lock可以知道线程有没有成功获取到锁
 * <p>
 * Synchronized 不需要用户手动释放锁，但是lock需要手动释放 否则导致死锁
 */
public class LockTest {
    public static void main(String[] args) {
        Lock lock1 = new ReentrantLock();
        ReentrantReadWriteLock lock2 = new ReentrantReadWriteLock();
        Lock lock4 = lock2.readLock();
        Lock lock5 = lock2.writeLock();
    }
}

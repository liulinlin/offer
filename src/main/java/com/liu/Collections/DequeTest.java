package com.liu.Collections;

import sun.awt.util.IdentityLinkedList;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * 双端队列
 */
public class DequeTest {
    public static void main(String[] args) {
        Deque<Integer> deque2 = new ArrayDeque<>();
        Deque<Integer> deque1 = new LinkedBlockingDeque();
        Deque<Integer> deque3 = new ConcurrentLinkedDeque<>();
        Deque<Integer> deque4 = new IdentityLinkedList<>();

        // 最重要的是：LinkList也是双端队列
        Deque<Integer> deque5 = new LinkedList<>();
    }
}

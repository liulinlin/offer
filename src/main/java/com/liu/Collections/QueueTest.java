package com.liu.Collections;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.*;

/**
 * Queue 队列
 * 里面只是列举了一些，还有很多没有写，可以找一下Queue接口的实现类，
 * 在 Eclipse中，在Type Hierarchy 中拉入该接口可以，、
 * IDEA下：Ctrl+H 快捷键
 */
public class QueueTest {
    public static void main(String[] args) {
        /*
            LinkedBlockingQueue     它是基于链表的队列，此队列按 FIFO（先进先出）排序元素。
         */
        Queue<Integer> queue1 = new LinkedBlockingQueue<>();
        /*
            ArrayBlockingQueue
            在构造时需要指定容量， 并可以选择是否需要公平性，如果公平参数被设置true，
            等待时间最长的线程会优先得到处理（其实就是通过将ReentrantLock设置为true来 达到这种公平性的：即等待时间最长的线程会先操作）。
            通常，公平性会使你在性能上付出代价，只有在的确非常需要的时候再使用它。
            它是基于数组的阻塞循环队 列，此队列按 FIFO（先进先出）原则对元素进行排序。
         */
        Queue<Integer> queue2 = new ArrayBlockingQueue<>(5);
        // 设置为 公平
        Queue<Integer> queue3 = new ArrayBlockingQueue<>(5, true);
        /*
        PriorityQueue 优先级队列
         */
        Queue<Integer> queue5 = new PriorityQueue<>();
        /*
        DelayQueue 里面的对象必须能够实现 Delayed 接口
        http://www.cnblogs.com/sunzhenchao/p/3515085.html
         */
        Queue<DelayQueueItem> queue6 = new DelayQueue<>();
        /*
        PriorityBlockingQueue 一个带优先级的 队列
            元素按优先级顺序被移除，该队列也没有上限（看了一下源码，PriorityBlockingQueue是对 PriorityQueue的再次包装，
            是基于堆数据结构的，而PriorityQueue是没有容量限制的，与ArrayList一样，所以在优先阻塞 队列上put时是不会受阻的。
            虽然此队列逻辑上是无界的，但是由于资源被耗尽，所以试图执行添加操作可能会导致 OutOfMemoryError），
            但是如果队列为空，那么取元素的操作take就会阻塞，所以它的检索操作take是受阻的。另外，往入该队列中的元 素要具有比较能力。
         */
        Queue<Integer> queue4 = new PriorityBlockingQueue<>();


    }
    static class DelayQueueItem implements Delayed{

        @Override
        public long getDelay(TimeUnit unit) {
            return 0;
        }

        @Override
        public int compareTo(Delayed o) {
            return 0;
        }
    }
}

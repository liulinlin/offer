package com.liu.practice;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

/**
 * <p>User: Liu Linlin
 * <p>Date: 2016/5/15 0:09.
 * <p>Version: 1.0
 */
public class LRULinkedHashMapDemo {
    public static class LRULinkedHashMap<K, V> extends LinkedHashMap<K, V> {

        /** serialVersionUID */
        private static final long serialVersionUID = -5933045562735378538L;

        /** 最大数据存储容量 */
        private static final int  LRU_MAX_CAPACITY     = 1024;

        /** 存储数据容量  */
        private int               capacity;

        /**
         * 默认构造方法
         */
        public LRULinkedHashMap() {
            super();
        }

        /**
         * 带参数构造方法
         * @param initialCapacity   容量
         * @param loadFactor        装载因子
         * @param isLRU             是否使用lru算法，true：使用（按方案顺序排序）;false：不使用（按存储顺序排序）
         */
        public LRULinkedHashMap(int initialCapacity, float loadFactor, boolean isLRU) {
            super(initialCapacity, loadFactor, true);
            capacity = LRU_MAX_CAPACITY;
        }

        /**
         * 带参数构造方法
         * @param initialCapacity   容量
         * @param loadFactor        装载因子
         * @param isLRU             是否使用lru算法，true：使用（按方案顺序排序）;false：不使用（按存储顺序排序）
         * @param lruCapacity       lru存储数据容量
         */
        public LRULinkedHashMap(int initialCapacity, float loadFactor, boolean isLRU, int lruCapacity) {
            super(initialCapacity, loadFactor, true);
            this.capacity = lruCapacity;
        }

        /**
         * @see java.util.LinkedHashMap#removeEldestEntry(java.util.Map.Entry)
         */
        protected boolean removeEldestEntry(Entry<K, V> eldest) {
            System.out.println(eldest.getKey() + "=" + eldest.getValue());

            if(size() > capacity) {
                return true;
            }
            return false;
        }
    }

    public static void main(String[] args) {

        LinkedHashMap<String, String> map = new LRULinkedHashMap<String, String>(16, 0.75f, true);
        map.put("a", "a"); //a  a
        map.put("b", "b"); //a  a b
        map.put("c", "c"); //a  a b c
        map.put("a", "a"); //   b c a
        map.put("d", "d"); //b  b c a d
        map.put("a", "a"); //   b c d a
        map.put("b", "b"); //   c d a b
        map.put("f", "f"); //c  c d a b f
        map.put("g", "g"); //c  c d a b f g

        map.get("d"); //c a b f g d
        for (Entry<String, String> entry : map.entrySet()) {
            System.out.print(entry.getValue() + ", ");
        }
        System.out.println();

        map.get("a"); //c b f g d a
        for (Entry<String, String> entry : map.entrySet()) {
            System.out.print(entry.getValue() + ", ");
        }
        System.out.println();

        map.get("c"); //b f g d a c
        for (Entry<String, String> entry : map.entrySet()) {
            System.out.print(entry.getValue() + ", ");
        }
        System.out.println();

        map.get("b"); //f g d a c b
        for (Entry<String, String> entry : map.entrySet()) {
            System.out.print(entry.getValue() + ", ");
        }
        System.out.println();

        map.put("h", "h"); //f  f g d a c b h
        for (Entry<String, String> entry : map.entrySet()) {
            System.out.print(entry.getValue() + ", ");
        }
        System.out.println();
    }
}

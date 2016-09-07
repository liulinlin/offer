package com.liu.Collections;

import java.util.*;

/**
 * @author: liulinlin1@jiuxian.com
 * @since：2016年9月6日 上午11:56:18
 */
public class HashSetTest {

    public static void main(String[] args) {
        // 创建
        Set<String> set = new HashSet<>();
        //initial capacity should be power of 2
        set = new HashSet<>(32);

        //setting backing HashMap initial capacity and load factor
        set = new HashSet<>(32, 0.80f);
        //creating HashSet from another Collection
        Set<String> set1 = new HashSet<>(set);
        Set<String> set2 = new HashSet<>(new ArrayList<>());

        Set<String> fruits = new HashSet<>();

        //add example
        fruits.add("Apple");
        fruits.add("Banana");

        //isEmpty example
        System.out.println("fruits set is empty = " + fruits.isEmpty());

        //contains example
        System.out.println("fruits contains Apple = " + fruits.contains("Apple"));
        System.out.println("fruits contains Mango = " + fruits.contains("Mango"));

        //remove example
        System.out.println("Apple removed from fruits set = " + fruits.remove("Apple"));
        System.out.println("Mango removed from fruits set = " + fruits.remove("Mango"));

        //size example
        System.out.println("fruits set size = " + fruits.size());

        //clear example
        fruits.clear();
        System.out.println("fruits set is empty = " + fruits.isEmpty());

        //addAll example
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");

        System.out.println("fruits set before addAll = " + fruits);
        System.out.println("list = " + list);
        fruits.addAll(list);
        System.out.println("fruits set after addAll = " + fruits);

        //iterator example
        /*
        这个地方需要注意，如果在遍历过程中，调用修改set结构的操作，如add,remove,会引起ConcurrentModificationException
         */
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println("iterator 遍历：Consuming fruit " + iterator.next());
            //wrong way of removing from Set, can throw java.util.ConcurrentModificationException
            // if("Orange".equals(fruit)) fruits.remove("Orange");
        }
        // ForEach 遍历
        fruits.forEach((k) -> {
            System.out.println("ForEach 遍历：Consuming fruit " + k);
        });


        // TODO Spliterator  一直没有看懂 需要后续再找找资料

        // TODO Stream
//        这个就涉及到 stream的一些可执行的操作了。可以后续学了 stream 后再进行补充。



        //removeAll example
        fruits.add("Orange");
        System.out.println("fruits set before removeAll = " + fruits);
        System.out.println("list = " + list);
        fruits.removeAll(list);
        System.out.println("fruits set after removeAll = " + fruits);

        Set<Integer> ints = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            ints.add(i);
        }
        System.out.println("ints set = " + ints);

        // set to array example
        Integer[] intArray = new Integer[ints.size()];
        intArray = ints.toArray(intArray);
        System.out.println("intArray = " + Arrays.toString(intArray));
        ints.remove(0);
        ints.remove(1);
        System.out.println("intArray = " + Arrays.toString(intArray));


        //array to set example
        ints = new HashSet<>(Arrays.asList(intArray));
        System.out.println("ints from array = " + ints);
        ints.remove(0);
        ints.remove(1);
        System.out.println("ints from array after remove = " + ints);
        System.out.println("intArray = " + Arrays.toString(intArray));

        Set<String> vowels = new HashSet<>();
        vowels.add("a");
        vowels.add("e");
        vowels.add("i");

        //set to list example
        List<String> vowelsList = new ArrayList<>(vowels);
        System.out.println("vowels set = " + vowels);
        System.out.println("vowelsList = " + vowelsList);

        vowels.add("o");
        vowelsList.add("a");
        vowelsList.add("u");
        System.out.println("vowels set = " + vowels);
        System.out.println("vowelsList = " + vowelsList);

        //list to set example
        vowels = new HashSet<>(vowelsList);
        System.out.println("vowels set = " + vowels);


    }

}

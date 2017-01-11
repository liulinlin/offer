package com.liu.practice.littleCase;

import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.stream.Stream;

/**
 * @author: liulinlin1@jiuxian.com
 * @since：2016年7月13日 下午6:00:26
 */
public class Main {

	public static void main(String[] args) {
		ConcurrentHashMap<String,String> t;
		
		String [] test6 = {"adsasd","adlsalsd","asdasda","alsdkalsd"};
		System.out.println(Arrays.toString(test6));
		int [] test7 = {1,2,3,4,5,56,8};
		System.out.println(Arrays.toString(test7));
		
//		 Stream.iterate(1, item -> item + 1).limit(10).forEach(System.out::println);

		List<Integer> nums = new ArrayList<>();
		nums.add(1);
		nums.add(1);
		nums.add(null);
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		nums.add(null);
		nums.add(6);
		nums.add(7);
		nums.add(8);
		nums.add(9);

		// System.out.println("sum is:"+nums.stream().filter(num -> num !=
		// null).distinct().mapToInt(num -> num *
		// 2).peek(System.out::println).skip(2).limit(4).sum());
		nums.stream().collect(java.util.stream.Collectors.toList());
		

		List<Integer> test = new ArrayList<>();
		Object[] testTOArray = test.toArray(new Object[0]);
		// 非同步hashmap
		HashMap<String, String> hashMap = new HashMap<>();
		// 同步hashmap
		ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();
		// 用于创建定时任务的
		ScheduledExecutorService scheduleExecutorService = Executors.newSingleThreadScheduledExecutor();
		// 用户读多写少的list ，写的做了同步
		CopyOnWriteArrayList<Integer> test1 = new CopyOnWriteArrayList<>();
		
		Hashtable<String, String> hashtable;

		
		
//		ObjectInputStream
		
		Queue<Integer> test3 ;
//		Arrays.asList(a)
		
		Map<Integer, String> map = new HashMap<>();
		for (int i = 0; i < 10; i++) {
		    map.putIfAbsent(i, "val" + i);
		}
//		map.forEach((id, val) -> System.out.println(val));
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEachOrdered(x->{System.out.println(x.getKey());System.out.println(x.getValue());});
		
		
		Set<String> test4 = new HashSet<>();
		test4.stream().forEachOrdered(x->{System.out.println(x);});
		
		Map<String, Integer> unsortMap = new HashMap<>();
        unsortMap.put("z", 10);
        unsortMap.put("b", 5);
        unsortMap.put("a", 6);
        unsortMap.put("c", 20);
        unsortMap.put("d", 1);
        unsortMap.put("e", 7);
        unsortMap.put("y", 8);
        unsortMap.put("n", 99);
        unsortMap.put("j", 50);
        unsortMap.put("m", 2);
        unsortMap.put("f", 9);

        System.out.println("Original...");
        System.out.println(unsortMap);

        Map<String, Integer> result = new LinkedHashMap<>();

        //sort by key, a,b,c..., and put it into the "result" map
        unsortMap.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByKey())
                .forEachOrdered(x -> result.put(x.getKey(), x.getValue()));

        System.out.println("Sorted...");
        System.out.println(result);
        
        
        List<String> test5 = Arrays.asList("adsads","asdjlfadlsf","asdjalsdkf","lasdlalsdkl");
        System.out.println(String.join(", ", test5));

	}
	
	public class testObject {
		
		@Override
		protected Object clone() throws CloneNotSupportedException {
			return super.clone();
		}
	}

}

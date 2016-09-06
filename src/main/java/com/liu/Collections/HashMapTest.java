package com.liu.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.TreeMap;
import java.util.function.BiFunction;

/**
 * @author: liulinlin1@jiuxian.com
 * @since：2016年9月6日 上午9:41:59
 */
public class HashMapTest {

	public static void main(String ... aaa) {
		// 每个主要练习 添加，删除，排序，遍历,是否重复
		Random random = new Random();
		// HashMap
		Map<String, Integer> hashmap = new HashMap<>();
		hashmap.put("test1", random.nextInt(21));
		hashmap.put("test2", random.nextInt(21));
		hashmap.put("test3", random.nextInt(21));
		hashmap.put("test4", random.nextInt(21));
		if (hashmap.containsKey("test4")) {
			System.out.println("test4原来的值是：" + hashmap.get("test4"));
			hashmap.put("test4", 25);
			System.out.println("test4现在的值是：" + hashmap.get("test4"));
		} else {
			hashmap.put("test5", random.nextInt(21));
		}
		// putifabsent:如果原来key 没有值 就将后面的值加入，如果有 ，就将原来的值返回，将想加入的的值舍弃。
		int temp = hashmap.putIfAbsent("test3", 100);
		System.out.println("test3原来的值是：" + temp);
		System.out.println("test3现在的值是：" + hashmap.get("test3"));
		int i = hashmap.remove("test1");
		System.out.println("test1的值是：" + i + "  test1是否还在 hashmap中：" + hashmap.containsKey("test1"));
		System.out.println("hashmap 中是否有 值 25：" + hashmap.containsValue(25));
		Iterator<Entry<String, Integer>> iterator = hashmap.entrySet().iterator();
		System.out.println("====entrySet iterator 遍历");
		while (iterator.hasNext()) {
			Entry<String, Integer> entry = iterator.next();
			System.out.println("key : " + entry.getKey() + "value : " + entry.getValue());
		}
		System.out.println("====keySet iterator 遍历");
		Iterator<String> iterator2 = hashmap.keySet().iterator();
		while (iterator2.hasNext()) {
			String key = iterator2.next();
			System.out.println("key : " + key + "value : " + hashmap.get(key));
		}
		System.out.println("====forEach 遍历");
		hashmap.forEach((k, v) -> System.out.println("key : " + k + " value : " + v));
		System.out.println("hashmap 是否为空：" + hashmap.isEmpty());
		System.out.println("hashmap 中是否有键 test0：" + hashmap.containsKey("test0") + " 没有的话给一个默认值1111："
				+ hashmap.getOrDefault("test0", 1111));
		System.out.println("hashmap 容量：" + hashmap.size());
		// 对于 replace 来说 之前没有的 是加不进去的 ，
		System.out.println("之前test2的值：" + hashmap.get("test2"));
		hashmap.replace("test2", 99);
		System.out.println("之后test2的值：" + hashmap.get("test2"));
		System.out.println("之前test7的值：" + hashmap.get("test7"));
		hashmap.replace("test7", 99);
		System.out.println("之后test7的值：" + hashmap.get("test7"));
		System.out.println("之前test2的值：" + hashmap.get("test2"));
		hashmap.replace("test2", 90, 91);
		System.out.println("之后test2的值：" + hashmap.get("test2"));
		System.out.println("之前test2的值：" + hashmap.get("test2"));
		hashmap.replace("test2", 99, 91);
		System.out.println("之后test2的值：" + hashmap.get("test2"));
		System.out.println("之前test2的值：" + hashmap.get("test2"));
		hashmap.replace("test2", hashmap.get("test2") + 100);
		System.out.println("之后test2的值：" + hashmap.get("test2"));
		System.out.println("之前test7的值：" + hashmap.get("test7"));
		hashmap.replace("test7", hashmap.get("test7") == null ? -1 : hashmap.get("test7") + 1000);
		System.out.println("之后test7的值：" + hashmap.get("test7"));
		// replaceall
		Map<String, String> map = new HashMap<>();
		map.put("1", "1");
		map.put("2", "2");
		map.put(null, "100");
		System.out.println("map before replaceAll = " + map);
		BiFunction<String, String, String> function = new MyBiFunction();
		map.replaceAll(function);
		System.out.println("map after replaceAll = " + map);

		// replaceAll using lambda expressions
		map.replaceAll((k, v) -> {
			if (k != null)
				return k + v;
			else
				return v;
		});
		System.out.println("map after replaceAll lambda expression = " + map);
		//TODO complate

		
		// 如果不给 TreeMap 传入比较器 TreeMap就按照默认的排序器升序排列。
		// 排序只能按照Key进行排序 ，如果需要按照值进行排序，需要自己实现。
		Map<String,Integer> treemap = new TreeMap<>();
		treemap.put("t1", 1);
		treemap.put("t3", 3);
		treemap.put("t2", 2);
		treemap.forEach((k,v)->{System.out.println("treemap : KEY="+k+" Value="+v);});
		// 实现按照value 进行排序，这个按照值排序 适用于map，不仅仅是treemap
		Map<String, Integer> sortDependValue = new HashMap<String, Integer>();
		sortDependValue.put("d", 2);
		sortDependValue.put("c", 1);
		sortDependValue.put("b", 1);
		sortDependValue.put("a", 3);
		List<Entry<String, Integer>> infoIds = new ArrayList<Entry<String, Integer>>(sortDependValue.entrySet());
		Collections.sort(infoIds, new Comparator<Entry<String, Integer>>() {
		    public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
		        return (o1.getValue() - o2.getValue());  // 按值升序排序
//		        return (o1.getKey()).toString().compareTo(o2.getKey()); // 按key升序排序
		    }
		}); 
		infoIds.stream().forEach((k)->{System.out.println("sortDependValue : KEY="+k.getKey()+" Value="+k.getValue());});
		// TreeMap
		// HashSet
		// TreeSet
		// ArrayList
		// LinkList
	}

	static class MyBiFunction implements BiFunction<String, String, String> {

		@Override
		public String apply(String t, String u) {
			if (t != null)
				return t + u;
			else
				return u;
		}
	}
}

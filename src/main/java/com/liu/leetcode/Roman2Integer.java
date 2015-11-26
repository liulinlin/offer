package com.liu.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Roman2Integer {
	public static int romanToInt(String s) {
		Map<String, Integer> maps = new HashMap<String,Integer>();
		maps.put("I", 1);
		maps.put("V", 5);
		maps.put("X", 10);
		maps.put("L", 50);
		maps.put("C", 100);
		maps.put("D", 500);
		maps.put("M", 1000);
		String ss = new StringBuffer(s.toUpperCase()).reverse().toString();
		char[] result = ss.toCharArray();
		int [] numbers = new int[result.length];
		numbers[0] = maps.get(result[0]+"");
		for (int i = 1; i < numbers.length; i++) {
			if(maps.get(result[i]+"")>=maps.get(result[i-1]+"")){
				numbers[i] = maps.get(result[i]+"");
			}else{
				numbers[i] = -maps.get(result[i]+"");
			}
		}
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		return sum;
	}
}

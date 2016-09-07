package com.liu.offer.DIDI;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int m = cin.nextInt();
        int[] zhuozi = new int[n];
        for (int i = 0; i < n; i++) {
            zhuozi[i] = cin.nextInt();
        }
        Map<Integer, Integer> customer = new TreeMap<Integer, Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for (int i = 0; i < m; i++) {
            int value = cin.nextInt();
            int key = cin.nextInt();
            customer.put(key, value);
        }
        int sum = getSum(zhuozi, customer);
        System.out.println(sum);
    }

    private static int getSum( int[] zhuozi, Map<Integer, Integer> customer) {
        int n = zhuozi.length;
        Arrays.sort(zhuozi);
        HashMap<Integer, Integer> yizuozhuozi = new HashMap<Integer, Integer>(n);
        Iterator<Map.Entry<Integer, Integer>> iterator = customer.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Integer> item = iterator.next();
            int jine = item.getKey();
            int renshu = item.getValue();
            for (int i = 0; i < n; i++) {
                if (renshu <= zhuozi[i]) {
                    if (yizuozhuozi.containsKey(i)) {
                        int old = yizuozhuozi.get(i);
                        if (jine > old) {
                            yizuozhuozi.put(i, jine);
                            break;
                        }
                    } else {
                        yizuozhuozi.put(i, jine);
                        break;
                    }
                }
            }
        }
        Object[] sums = yizuozhuozi.values().toArray();
        int sum = 0;
        for (int i = 0; i < sums.length; i++) {
            sum += (int) sums[i];
        }
        return sum;
    }
}

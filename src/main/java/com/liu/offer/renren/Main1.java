package com.liu.offer.renren;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

public class Main1 {
    public static void main(String[] args) {
        test();
    }

    public static void test() {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            LinkedHashMap<String, Integer> money = new LinkedHashMap<>(n);
            LinkedHashMap<String, Integer> redmoney = new LinkedHashMap<>(n);
            // 初始化
            for (int i = 0; i < n; i++) {
                String name = in.next();
                money.put(name, 0);
                redmoney.put(name, 0);
            }
            // 发红包
            for (int i = 0; i < n; i++) {
                String name = in.next();
                int mi = in.nextInt();// 钱数
                int ki = in.nextInt(); // 分给ki个人
                int mode = ki != 0 ? mi % ki : 0;
                int red = ki != 0 ? mi / ki : 0;
                money.put(name, mi - mode);
                for (int j = 0; j < ki; j++) {
                    String shouName = in.next();
                    redmoney.put(shouName, redmoney.get(shouName) + red);
                }
            }
            Set<String> name = money.keySet();
            for (String p : name) {
                System.out.println(p + " " + (redmoney.get(p) - money.get(p)));
            }
        }
    }
}

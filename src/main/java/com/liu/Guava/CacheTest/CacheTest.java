package com.liu.Guava.CacheTest;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

import java.util.concurrent.ExecutionException;

/**
 * @author liulinlin1
 * @since：2016/10/8
 */
public class CacheTest {
    public static void main(String[] args) throws ExecutionException {
        cache1();
    }

    public static void cache1() throws ExecutionException {
        LoadingCache<String, String> cahceBuilder = CacheBuilder
                .newBuilder()
                .build(new CacheLoader<String, String>() {
                    @Override
                    public String load(String key) throws Exception {
                        String strProValue = "hello " + key + "!";
                        return strProValue;
                    }
                });

        System.out.println("jerry value:" + cahceBuilder.apply("jerry"));
        System.out.println("jerry value:" + cahceBuilder.get("jerry"));
        System.out.println("peida value:" + cahceBuilder.get("peida"));
        System.out.println("peida value:" + cahceBuilder.apply("peida"));
        System.out.println("lisa value:" + cahceBuilder.apply("lisa"));
        cahceBuilder.put("harry", "ssdded");
        System.out.println("harry value:" + cahceBuilder.get("harry"));

    }
}

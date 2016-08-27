package com.liu.RedisPractece;

import redis.clients.jedis.Jedis;

import java.util.List;
import java.util.Set;

/**
 * User: linlinliu
 * Date: 16-6-1
 * Time: 下午3:25
 * Email: 553656977@qq.com
 */
public class RedisJava {
    public static void main(String[] args) {
        CheckList();
    }

    /**
     * 练习连接redis数据库
     */
    public static void CheckContect(){
        //Connecting to Redis server on localhost
        Jedis jedis = new Jedis("localhost");
        System.out.println("Connection to server sucessfully");
        //check whether server is running or not
        System.out.println("Server is running: " + jedis.ping());
    }

    /**
     * 练习插入　得到　字符串
     */
    public static void CheckString(){
        //Connecting to Redis server on localhost
        Jedis jedis = new Jedis("localhost");
        System.out.println("Connection to server sucessfully");
        //set the data in redis string
        jedis.set("tutorial-name", "Redis tutorial");
        // Get the stored data and print it
        System.out.println("Stored string in redis:: "+ jedis.get("tutorial-name"));
    }
    /**
     * 练习列表
     */
    public static void CheckList(){
        //Connecting to Redis server on localhost
        Jedis jedis = new Jedis("localhost");
        System.out.println("Connection to server sucessfully");
        //store data in redis list
        jedis.lpush("tutorial-list", "Redis");
        jedis.lpush("tutorial-list", "Mongodb");
        jedis.lpush("tutorial-list", "Mysql");
        // Get the stored data and print it
        List<String> list = jedis.lrange("tutorial-list", 0 ,5);
        for(int i=0; i<list.size(); i++) {
            System.out.println("Stored string in redis:: "+list.get(i));
        }
    }
    /**
     * 练习　keys
     */
    public static void CheckKeys(){
        //Connecting to Redis server on localhost
        Jedis jedis = new Jedis("localhost");
        System.out.println("Connection to server sucessfully");
        //store data in redis list
        // Get the stored data and print it
        Set<String> set =jedis.keys("*");
        for(String str :set) {
            System.out.println("List of stored keys:: "+str);
        }
    }

}

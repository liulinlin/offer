package com.liu.Guava;

import com.google.common.base.Joiner;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 刘林林 on 2016/3/5.
 */
public class JoinerTest {
    // 传统做法
   public static  String JoinByJava(List stringList,String delimiter){
       StringBuilder builder = new StringBuilder();
       for (Object item :  stringList){
           if (item != null){
               builder.append(item).append(delimiter);
           }
       }
       builder.setLength(builder.length()-delimiter.length());
       return builder.toString();
   }

    // Guava 做法
    public static String JoinByGuava(List stringList, String delimiter) {
        return Joiner.on(delimiter).skipNulls().join(stringList);
    }
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("2");
        list.add("1");
        list.add(null);
        list.add("3");

        System.out.println(JoinerTest.JoinByJava(list, "|"));
        System.out.println(JoinerTest.JoinByGuava(list, "|"));
    }

}
